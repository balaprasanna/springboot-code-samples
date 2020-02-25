package com.bala.jwtdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String hello() {
		return "Hello world";
	}
}
