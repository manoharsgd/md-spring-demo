package com.springazur.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDemoController {

    @RequestMapping("/message")
    public String getmessage()
    {
        return "Welcome to Spring Boot Azur....";
    }
}
