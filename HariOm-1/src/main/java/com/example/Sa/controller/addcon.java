package com.example.Sa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addcon {


	@GetMapping("/addition/{a}/{b}")
	public double add(@PathVariable int a, @PathVariable int b) {
		return a+b;
		
	}
}


