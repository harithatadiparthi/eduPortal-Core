package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.Customer;
import com.example.demo.repository.CustomerRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Customercontroller {
	
@Autowired
	  CustomerRepository repository;
	
	 @GetMapping(value = "customers/Firstname/{Firstname}")
	  public List<Customer> findByFirstname(@PathVariable String firstname) {
	 
	    List<Customer> customers = repository.findByFirstname(firstname);
	    return customers;
	 }
}
