package com.bala.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCrypt;


@SpringBootApplication
@EnableJpaRepositories( basePackageClasses = UserRepository.class)
public class AuthDemoApplication {

	public static void main(String[] args) {
		System.out.println("Password  for bala-> " + BCrypt.hashpw("bala", BCrypt.gensalt()) );
		System.out.println("Password  for admin-> " + BCrypt.hashpw("admin", BCrypt.gensalt()) );
		
		SpringApplication.run(AuthDemoApplication.class, args);
	}

}
