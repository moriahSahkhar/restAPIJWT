package com.restAPISecurity.restAPI.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restAPISecurity.restAPI.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);
	
}
