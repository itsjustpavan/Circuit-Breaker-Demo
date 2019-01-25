package com.circuitbreaker.hellocircuit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class HelloResource {
	
	@GetMapping
	public String helloWorld() {
		return "Welcome to the hello world page";
	}

}
