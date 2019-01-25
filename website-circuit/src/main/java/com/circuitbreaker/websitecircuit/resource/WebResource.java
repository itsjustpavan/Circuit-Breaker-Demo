package com.circuitbreaker.websitecircuit.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.circuitbreaker.websitecircuit.WebsiteService;

@EnableCircuitBreaker
@RestController
public class WebResource {
	
	
	@Autowired	
	private WebsiteService websiteService;
	
	@RequestMapping("/")
	public String index() {
		return "Welcome to the Web page";
	}
	
	@RequestMapping("/hello")
	public String display(/* Model model */)
	{
		/*
		 * ResponseEntity<String>
		 * entity=restTemplate.getForEntity("http://localhost:8080/hi", String.class);
		 * String hello=entity.getBody(); model.addAttribute("hello",hello); return
		 * "hello";
		 */
		
		return websiteService.display();
		
	}
	

}
