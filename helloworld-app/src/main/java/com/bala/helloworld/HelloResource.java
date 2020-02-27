package com.bala.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@GetMapping(path = "/")
	public String root() {
		return  "Main page";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String HelloWorld() {
		return "Hello world";
	}

}
