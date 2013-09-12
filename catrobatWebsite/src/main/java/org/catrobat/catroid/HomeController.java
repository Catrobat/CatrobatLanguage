package org.catrobat.catroid;

import java.io.IOException;

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

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String Upload(
			@RequestParam(value = "file", required = true) MultipartFile file)
			throws IOException {
		System.out.println(file.getOriginalFilename());
		return "home";
	}

}
