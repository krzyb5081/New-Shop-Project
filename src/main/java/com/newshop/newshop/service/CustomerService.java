package com.newshop.newshop.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.newshop.newshop.model.Account;
import com.newshop.newshop.model.Customer;
import com.newshop.newshop.repository.AccountRepository;
import com.newshop.newshop.repository.CustomerRepository;

@Service
public class CustomerService {
	
	public Customer customer;
	public Account account;
	
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	AccountRepository accountRepository;
	
	public ResponseEntity<Customer> addCustomer(String name,  String surname) {
		customer = new Customer();
		account = new Account();
		
		Set<Account> accountsFactory = new HashSet<Account>();
		Account accountMaker = new Account();
		accountMaker.setNickname(name+surname);
		accountMaker.setPassword("123");
		accountsFactory.add(accountMaker);
		
		customer.setName(name);
		customer.setSurname(surname);
		customer.setAccounts(accountsFactory);
		
		accountRepository.saveAll(accountsFactory);
		Long customerId = customerRepository.save(customer).getId();
		System.out.print("udalo sie czy cos");
		
		try {
			return new ResponseEntity<Customer>(getCustomer(customerId), HttpStatus.OK);

		}
		catch(Exception e) {
			return new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	public Customer getCustomer(Long id) {
		return customerRepository.getById(id);
	}
	
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	
}
