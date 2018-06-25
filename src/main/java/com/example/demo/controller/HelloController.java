package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.BusinessException;

@RestController
public class HelloController {

	@Value("${tw.msg}")
	private String message;

	@RequestMapping("/greeting")
	public String hello() {
//		throw new BusinessException(100, "出错了");
		 return message;
	}
}
