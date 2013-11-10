package com.kusandriadi.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	private Logger log = LoggerFactory.getLogger(WelcomeController.class);

	@RequestMapping(value="/user/welcomeUser", method=RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String welcomeUser(ModelMap map, Principal principal ) {
		log.info("welcomeUser service executed...");
		String name = principal.getName();
		map.addAttribute("username", name);
		return "/user/welcomeUser";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome(ModelMap map) {
		log.info("welcome service executed...");
		map.addAttribute("welcome", "Welcome! This is free page, All User can look this page :D");
		return "welcome";
	}
}
