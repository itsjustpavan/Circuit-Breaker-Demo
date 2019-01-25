package com.circuitbreaker.websitecircuit;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WebsiteService {	
	private final RestTemplate restTemplate;

	  public WebsiteService(RestTemplate rest) {
	    this.restTemplate = rest;
	  }
	  
	  
	  @HystrixCommand(fallbackMethod = "hello")
	  public String display() {
	    URI uri = URI.create("http://localhost:8080/hi");

	    return this.restTemplate.getForObject(uri, String.class);
	  }

	  public String hello() {
	    return "The service is currently down so kindly wait for few minutes";
	  }

	}