package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/success")
	public String success() {
		return "success";
	}
	
	@GetMapping("/sleep/{sleeptime}")
	public String sleep(@PathVariable("sleeptime") int sleeptime) {
		
		try {
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "sleep";
		
	}
	
	@GetMapping("/exception")
	public String exception() {
		throw new NullPointerException();
	}

}
