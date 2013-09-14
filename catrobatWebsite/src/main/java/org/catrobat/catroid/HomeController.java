package org.catrobat.catroid;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import org.apache.commons.io.FileUtils;
import org.catrobat.catroid.content.XmlHeader;
import org.catrobat.catroid.translator.Translator;
import org.catrobat.catroid.yaml.YamlProject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		return "home";
	}

	private Map<String, String> createrHeaderMap(XmlHeader header) {
		Map<String, String> headerMap = new TreeMap<String, String>();
		headerMap.put("programName", header.getProgramName());
		headerMap.put("description", header.getDescription());

		headerMap.put("screenWidth",
				(new Integer(header.getVirtualScreenWidth())).toString());
		headerMap.put("screenHeight",
				(new Integer(header.getVirtualScreenHeight())).toString());

		headerMap.put("catrobatLanguageVersion",
				(new Double(header.getCatrobatLanguageVersion())).toString());

		headerMap.put("applicationBuildName", header.getApplicationBuildName());
		headerMap.put("applicationBuildNumber",
				(new Integer(header.getApplicationBuildNumber())).toString());
		headerMap.put("applicationName", header.getApplicationName());
		headerMap.put("applicationVersion", header.getApplicationVersion());
		headerMap.put("dateTimeUpload", header.getDateTimeUpload());
		headerMap.put("deviceName", header.getDeviceName());
		headerMap.put("mediaLicense", header.getMediaLicense());
		headerMap.put("platform", header.getPlatform());
		headerMap.put("platformVersion",
				(new Integer(header.getPlatformVersion())).toString());
		headerMap.put("programLicense", header.getProgramLicense());
		headerMap.put("remixOf", header.getRemixOf());
		headerMap.put("tags", header.getTags());
		headerMap.put("url", header.getUrl());
		headerMap.put("userHandle", header.getUserHandle());

		return headerMap;
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String Upload(
			@RequestParam(value = "file", required = true) MultipartFile file, Model model)
			throws IOException {
		// TODO: check type .catrobat
		// TODO: quick click -> internal error change folder to random name!
		if (file == null) return "error";

		String fileName = file.getOriginalFilename();
		String projectName = new StringBuffer(fileName).substring(0,
				fileName.length() - 9);

		// String tempFolder = System.getProperty("java.io.tmpdir");
		String tempFolder = "D:/Users/TDiva/Desktop/temp/" + projectName;
		File projectDir = new File(tempFolder);
		if (projectDir.exists())
			FileUtils.deleteDirectory(projectDir);
		if (!projectDir.mkdir())
			System.out.println("Cannot create project directory.");

		String filePath = tempFolder + "/" + fileName;
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(new File(filePath));
			outputStream.write(file.getBytes());
			outputStream.close();
		} catch (Exception e) {
			// TODO: create error page
			System.out.println("Error while saving file");
			return "error";
		}

		ZipFile zip;
		try {
			zip = new ZipFile(filePath);
			zip.extractAll(tempFolder);
		} catch (ZipException e) {
			e.printStackTrace();
		}

		File xmlProject = new File(tempFolder + "/code.xml");
		YamlProject project = new YamlProject(Translator.getInstance().loadProjectFromXML(
				xmlProject));

		model.addAttribute("xmlHeader", createrHeaderMap(project.getHeader()));
		model.addAttribute("objectNames", project.getObjects().keySet()); 
		model.addAttribute("activeTab", "header");

		return "home";
	}
}
