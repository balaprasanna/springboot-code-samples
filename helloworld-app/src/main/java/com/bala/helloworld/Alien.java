package com.bala.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // For on demand
public class Alien {

	@Autowired
	private Friend friend;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Alien(String name) {
		super();
		this.name = name;
	}

	public Alien() {
		super();
	}
	
	public String Show() {
		return "Showing..." + this.hashCode() + " - " + friend.getName();
	}
	
}
