package com.douglashdezt.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/greet")
	public String greetings() {
		return "greetings";
	}
	
	@GetMapping("/say-hello")
	public String sayHello(@RequestParam(name = "name", defaultValue = "No one!") String name, Model model) {
		//System.out.println(name);
		model.addAttribute("someone", name);
		return "hello";
	}
}
