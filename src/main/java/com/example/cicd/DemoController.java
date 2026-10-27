package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/begin")
	public String begin() {
		return "application started working";
	}
	
	@GetMapping("/stop")
	public String stop() {
		return "application stopped working";
	}

}
