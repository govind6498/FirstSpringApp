package com.bridgelabz.firstspringapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	@RequestMapping(value= {"","/","/home"})
	public String syHello() {
		return "Hello from BridgeLabz";
	}
}
