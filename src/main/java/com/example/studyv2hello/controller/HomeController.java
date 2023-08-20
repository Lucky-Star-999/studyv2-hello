package com.example.studyv2hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home(@RequestParam(required = false) String name) {
        if (name == null) {
            name = "Stranger";
        }

        return "Hello " + name + "! This is the homepage";
    }

}
