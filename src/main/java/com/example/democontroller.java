package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
	
	@GetMapping("/")
	public String test()
	{
		return "Deployment Succesful";
	}

}
