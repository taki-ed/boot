package com.soat.test.boot.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(path="/SayHi")
	public String SayHi() {
		return "Hello all";
	}
	
}
