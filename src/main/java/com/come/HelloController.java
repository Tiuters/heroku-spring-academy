package com.come;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
	@GetMapping("/")
	String hello() {
		return "hello world";
	}
}