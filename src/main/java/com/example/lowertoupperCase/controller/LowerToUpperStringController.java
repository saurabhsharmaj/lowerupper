package com.example.lowertoupperCase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LowerToUpperStringController {

	@GetMapping("/{name}")
	public String getString(@PathVariable String name) {
		name = name.toUpperCase()+" SHARMA V4.0";
		return name;
	}

	@GetMapping("/health")
	public String getHealth() {
		
		return "OK";
	}
}
