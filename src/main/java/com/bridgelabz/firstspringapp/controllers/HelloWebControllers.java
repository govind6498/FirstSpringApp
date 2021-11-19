package com.bridgelabz.firstspringapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebControllers {
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message","This is a cutom message.Hello from BridgeLabz");
		return "message";
	}
}
