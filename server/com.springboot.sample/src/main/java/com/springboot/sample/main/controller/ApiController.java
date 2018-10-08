package com.springboot.sample.main.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@EnableAutoConfiguration
public class ApiController {
 
    @RequestMapping(value = "/")
    @ResponseBody
    String hello() {
        return "Hello World! Spring boot is so simple.";
    }
    
}