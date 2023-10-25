package com.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetapi")
public class FirstApiController {
	
	@GetMapping("/v1")
	public String greetHello() {
		return "Hello World!!";
	}
	
	@GetMapping("/v1/hello")
	public String greetHelloWithName(@RequestParam(defaultValue = "World") String name) {
		return "Hello " + name + " !!";
	}

}
