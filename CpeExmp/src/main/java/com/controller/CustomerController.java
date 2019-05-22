package com.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.repo.UserRepository;
 

@RestController

public class CustomerController {
 
  @Autowired
  UserRepository repository;
 
  @GetMapping("/manage")
  public ResponseEntity<List<User>> getAllUsers() {
	  List<User> users = (List<User>) repository.findAll();
	  if (users.isEmpty()) { 
		  			System.out.println("Employees does not exists"); 
		  			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT); 
		 		} 
	  else {
		  return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	  }
  }
 
  @PostMapping(value = "/create")
  public ResponseEntity<User> addEmployee(@RequestBody User user) { 
	  		repository.save(user); 
	  		return new ResponseEntity<User>(user, HttpStatus.CREATED); 
	  } 

  @GetMapping(value="/edit")
  public ResponseEntity<Void> updateUser(@RequestBody User user) {
	  repository.save(user); 
	  		return new ResponseEntity<Void>(HttpStatus.OK); 


	  
  }
  @DeleteMapping(value="/delete")
  public ResponseEntity<Void> deleteUser(@RequestBody User user) {
	  return new ResponseEntity<Void>(HttpStatus.OK);
  }
  
  @GetMapping(value="/details")
  public ResponseEntity<User> getUser(@RequestBody User user) {
	  return new ResponseEntity<User>(user, HttpStatus.OK);
  }
 
}

