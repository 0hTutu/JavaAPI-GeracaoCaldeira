package com.example.JavaGeracaoCaldeira.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String exibeHelloWorld(@RequestParam(value = "name", defaultValue = "World")String name){
        return String.format("Hello %s!", name);
    }
}
