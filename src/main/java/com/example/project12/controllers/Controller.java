package com.example.project12.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class Controller {

    @GetMapping("/1")
    public String get1() {
        return "get1";
    }
}
