package com.kusandriadi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WelcomeController {

    private Logger log = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping(value = "/user/welcomeUser")
    public String welcomeUser(ModelMap map, Principal principal) {
        log.info("welcomeUser service executed...");
        String name = principal.getName();
        map.addAttribute("username", name);
        return "/user/welcomeUser";
    }

    @GetMapping(value = "/welcome")
    public String welcome(ModelMap map) {
        log.info("welcome service executed...");
        map.addAttribute("welcome", "Welcome! This is free page, All User can look this page :D");
        return "welcome";
    }
}
