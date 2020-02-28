package com.bala.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	//@Query("SELECT * from User as u where u.username =: username")
	public Optional<User> findByUsername(String username);
	
}
