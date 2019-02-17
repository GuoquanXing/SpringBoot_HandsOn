package com.tutorial.configserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping(value = "/")
    public String welcomeText() {
        return "welcomeText";
    }
}
