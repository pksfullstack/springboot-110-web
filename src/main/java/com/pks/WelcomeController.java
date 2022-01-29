package com.pks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	// local  - http://localhost:8080/springboot-110-web/hello
	// docker - http://localhost:8089/hello
	@GetMapping("/hello")
	public String showWelcomePage(ModelMap model) {
		model.put("name", "PKS !");
		return "welcome";
	}

}
