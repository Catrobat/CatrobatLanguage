package org.catrobat.catroid;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import org.apache.commons.io.FileUtils;
import org.catrobat.catroid.common.LookData;
import org.catrobat.catroid.common.SoundInfo;
import org.catrobat.catroid.content.XmlHeader;
import org.catrobat.catroid.translator.Translator;
import org.catrobat.catroid.yaml.YamlProject;
import org.catrobat.catroid.yaml.YamlSprite;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {

	private String tempFolder = null;

	public String getTempFolder() {
		if (tempFolder == null)
			// String tempFolder = System.getProperty("java.io.tmpdir") +
			// UUID.randomUUID().toString();
			tempFolder = "D:/Users/TDiva/Desktop/temp/"
					+ UUID.randomUUID().toString();

		return tempFolder;

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

		List<String> emptyValues = new ArrayList<String>();
		for (String item : headerMap.keySet())
			if (headerMap.get(item) == null || headerMap.get(item) == "") {
				emptyValues.add(item);
			}
		for (String item : emptyValues)
			headerMap.remove(item);

		return headerMap;
	}

	private Map<String, String> createLooksMap(List<LookData> looks) {
		Map<String, String> looksMap = new TreeMap<String, String>();

		for (LookData item : looks) {
			looksMap.put(item.getName(), item.getFileName());
		}
		return looksMap;
	}

	private Map<String, String> createSoundsMap(List<SoundInfo> sounds) {
		Map<String, String> soundsMap = new TreeMap<String, String>();

		for (SoundInfo item : sounds) {
			soundsMap.put(item.getName(), item.getFileName());
		}
		return soundsMap;
	}

	public Map<String, String> createObjectNamesMap(Set<String> names) {
		Map<String, String> map = new TreeMap<String, String>();
		for (String item : names) {
			map.put(item, escape(item));
		}
		return map;
	}

	private String escape(String str) {
		// TODO: add all characters which we need to escape
		str = str.replace(" ", "");
		str = str.replace("\"", "");
		str = str.replace("&", "");
		str = str.replace("?", "");
		return str;
	}

	private void setDefaultModelAttributes(Model model, String activeTab,
			YamlProject project) {
		model.addAttribute("programName", project.getHeader().getProgramName());
		model.addAttribute("activeTab", escape(activeTab));
		model.addAttribute("objectNames", createObjectNamesMap(project
				.getObjects().keySet()));
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		return "home";
	}

	@RequestMapping(value = "/*", method = RequestMethod.POST)
	public String Upload(
			@RequestParam(value = "file", required = true) MultipartFile file,
			Model model) throws IOException {

		// TODO: check type .catrobat
		// TODO: quick click -> internal error change folder to random name!
		if (file == null)
			return "home";

		File projectDir = new File(getTempFolder());
		if (projectDir.exists())
			FileUtils.deleteDirectory(projectDir);
		if (!projectDir.mkdir())
			System.out.println("Cannot create project directory.");

		String filePath = getTempFolder() + "/" + file.getOriginalFilename();
		;
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
			zip.extractAll(getTempFolder());
		} catch (ZipException e) {
			e.printStackTrace();
		}

		return getHeader(model);
	}

	@RequestMapping(value = "xmlHeader", method = RequestMethod.GET)
	public String getHeader(Model model) {

		File xmlProject = new File(getTempFolder() + "/code.xml");
		YamlProject project = new YamlProject(Translator.getInstance()
				.loadProjectFromXML(xmlProject));

		setDefaultModelAttributes(model, "xmlHeader", project);

		model.addAttribute("xmlHeader", createrHeaderMap(project.getHeader()));

		return "home";
	};

	@RequestMapping(value = "variables", method = RequestMethod.GET)
	public String getVariables(Model model) {

		File xmlProject = new File(getTempFolder() + "/code.xml");
		YamlProject project = new YamlProject(Translator.getInstance()
				.loadProjectFromXML(xmlProject));

		setDefaultModelAttributes(model, "variables", project);

		model.addAttribute("variables", project.getProjectVariables());

		return "home";
	};

	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String getObject(Model model, HttpServletRequest request) {
		String escapedObjectName = request.getRequestURI().replaceAll(
				request.getContextPath() + "/", "");
		System.out.println(escapedObjectName);

		File xmlProject = new File(getTempFolder() + "/code.xml");
		YamlProject project = new YamlProject(Translator.getInstance()
				.loadProjectFromXML(xmlProject));
		Map<String, String> escapedNames = createObjectNamesMap(project
				.getObjects().keySet());
		if (!escapedNames.containsValue(escapedObjectName))
			return "error";
		String objectName = null;
		for (String item : escapedNames.keySet()) {
			if (escapedNames.get(item).equals(escapedObjectName)) {
				objectName = item;
				break;
			}
		}
		YamlSprite sprite = project.getObjects().get(objectName);
		setDefaultModelAttributes(model, escapedObjectName, project);

		model.addAttribute("name", objectName);
		model.addAttribute("looks", createLooksMap(sprite.getLooks()));
		model.addAttribute("sounds", createSoundsMap(sprite.getSounds()));
		model.addAttribute("scripts", sprite.getScripts());
		model.addAttribute("variables", sprite.getVariables());
		return "home";
	}

}
