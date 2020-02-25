package com.bala.auth;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {

	
	private List<GrantedAuthority> authorities;
	private User user;

	public MyUserDetails(User user) {
	
		this.user = user;
		
		this.authorities = Arrays
				.stream(user.getRole().split(","))
				.map((r) -> {  return new SimpleGrantedAuthority(r); })
				.collect(Collectors.toList());
		
//		this.authorities = Arrays.stream( user.getRole().split(",") )
//				.map(SimpleGrantedAuthority::new)
//				.collect(Collectors.toList());
		
				
	}
	
	public MyUserDetails() {}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		if (user.getActive() == 1)
			return true;
		else
			return false;
	}
	
}
