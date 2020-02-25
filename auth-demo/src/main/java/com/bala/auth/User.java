package com.bala.auth;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.*;

@Entity
public class User {
	
	@Id
	private Integer id;
	private String username;
	private String password;
	private String email;
	private Integer active;
	private String role;
	
	public User(Integer userid, String username, String password, String email, Integer active, String role) {
		super();
		this.id = userid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.active = active;
		this.role = role;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public Integer getUserid() {
		return id;
	}
	public void setUserid(Integer userid) {
		this.id = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
