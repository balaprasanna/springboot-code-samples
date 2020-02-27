package com.bala.helloworld;

import org.springframework.stereotype.Component;

@Component
public class Friend {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	public Friend() {
		super();
		this.name = "bala";
	}
	
}
