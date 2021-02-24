package com.jalasoft.runner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExecuteController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
