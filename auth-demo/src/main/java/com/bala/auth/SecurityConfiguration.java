package com.bala.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		// super.configure(auth);

		/*
		 *  IN Memory Authentication
		auth.inMemoryAuthentication()
			.withUser("bala1").password("{noop}bala1").roles("USER")
			.and()
			.withUser("bala2").password("{noop}bala2").roles("ADMIN");
		*/
		
		auth.userDetailsService( userDetailsService);
	}
	
	
//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return NoOpPasswordEncoder().getInstance();
//	}
	@Bean
	public PasswordEncoder passwordEncoder() {
	    //return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	    return new BCryptPasswordEncoder();
	}
	
	
	
	// Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/admin").hasRole("ADMIN")
			.antMatchers("/user").hasAnyRole("USER", "ADMIN" )
			.antMatchers("/").permitAll()
			.and().formLogin();
		
	}

}
