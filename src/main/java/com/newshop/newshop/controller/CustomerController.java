package com.newshop.newshop.controller;

import org.springframework.web.bind.annotation.RestController;

import com.newshop.newshop.model.Customer;
import com.newshop.newshop.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/addCustomer/{name}/{surname}")
	public ResponseEntity<Customer> addCustomer(@PathVariable("name")String name, @PathVariable("surname")String surname) {
		return customerService.addCustomer(name, surname);
		
	}
	@GetMapping("/showCustomers")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
		
	}
}
