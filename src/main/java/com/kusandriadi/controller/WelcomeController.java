package com.kusandriadi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kusandriadi.entity.User;

@Controller
public class WelcomeController {
	
	private Logger log = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value="/welcomeUser", method=RequestMethod.GET)
	public String welcomeUser(ModelMap map, User user) {
		log.info("welcomeUser service executed...");
		return "welcomeUser";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome(ModelMap map) {
		log.info("welcome service executed...");
		map.addAttribute("welcome", "Welcome! This is free page, All User can look this page :D");
		return "welcome";
	}
}
