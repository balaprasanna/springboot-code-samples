package com.bala.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@Autowired
	private UserRepository userRepo; 
	
	@RequestMapping(path = "/" , method = RequestMethod.GET)
	public String root() {
		return "Hello world";
	}
	
	@GetMapping("/user")
	public String userPage() {

		return "Welcome to User page";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "Welcome to Admin page";
	}

}
