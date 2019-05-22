package com.eduportal.demo.config;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncode {

  public static void main(String[] args) {
		String password = "hyderabad";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);

		System.out.println(hashedPassword);
		password = "veerendra";
		hashedPassword = passwordEncoder.encode(password);

		System.out.println(hashedPassword);
	}

  }

