package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String HelloWorld(){
        return "Hello World";
    }

    @GetMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
