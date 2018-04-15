package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@PropertySource(value = {"classpath:application.properties"},encoding="utf-8") 
public class HelloController {  
	
	@Value("${tw.msg}")
	private String message;
	
    @RequestMapping("/greeting")  
    public String hello()  
    {  
        return message;  
    }  
} 
