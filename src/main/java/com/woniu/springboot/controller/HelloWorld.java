package com.woniu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorld {
	@RequestMapping("spring")
	public String dosome() {
		return "hello 帅哥";
	}
}
