package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.customer.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long>{
	 
List<Customer> findByFirstname(@PathVariable String firstname);


}
