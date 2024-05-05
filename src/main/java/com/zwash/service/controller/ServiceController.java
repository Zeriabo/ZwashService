package com.zwash.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ServiceController {
	@GetMapping("/service")
	public String hello()
	{
		return "Hello ..there i am zwash service.";
	}
	
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome to zwash service ...";
	}
}
