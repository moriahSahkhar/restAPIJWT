package com.restAPISecurity.restAPI.controller;

import org.springframework.stereotype.Service;

import com.restAPISecurity.restAPI.repo.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
	
	private UserRepo userRepo;

	public AuthenticationResponse register(RegisterRequest request) {
		return null;
	}

	public AuthenticationResponse authenticate(AuthenticationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
