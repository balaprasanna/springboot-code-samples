package com.bala.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloworldAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(HelloworldAppApplication.class, args);
		
		Alien a = ctx.getBean(Alien.class);
		System.out.println(a.Show());
		
		Alien a1 = ctx.getBean(Alien.class);
		System.out.println(a1.Show());
	}

}
