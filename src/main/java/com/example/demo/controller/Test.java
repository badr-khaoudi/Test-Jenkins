package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/Test-Jenkins/hello")
	public String test() {
		return("Hello World!");
	}
}
