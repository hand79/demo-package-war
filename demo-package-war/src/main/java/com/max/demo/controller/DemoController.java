package com.max.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/")
public class DemoController {

	@GetMapping("/hello")
	public String doHelloWord() {
		log.info("Test Hello");
		return "hello";
	}
	
}
