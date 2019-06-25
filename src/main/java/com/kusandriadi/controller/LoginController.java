package com.kusandriadi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private Logger log = LoggerFactory.getLogger(LoginController.class);

    @GetMapping(value = "/login")
    public String login(ModelMap map) {
        log.info("login service executed...");
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout(ModelMap map) {
        log.info("logout service executed...");
        return "logout";
    }

    @GetMapping(value = "/loginError")
    public String loginError(ModelMap map) {
        log.info("loginError service executed...");
        map.addAttribute("error", true);
        return "loginError";
    }

}
