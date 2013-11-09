package com.kusandriadi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	private Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String login(ModelMap map) {
		log.info("login service executed...");
		return "login";
	}
	
	@RequestMapping(value = "/logout", method=RequestMethod.GET)
	public String logout(ModelMap map) {
		log.info("logout service executed...");
		return "logout";
	}
	
	@RequestMapping(value = "/loginError", method=RequestMethod.GET)
	public String loginError(ModelMap map) {
		log.info("loginError service executed...");
		map.addAttribute("error", true);
		return "loginError";
	}

}
