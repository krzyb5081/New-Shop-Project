package com.newshop.newshop.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	long id;
	String name;
	String surname;
	
	@OneToMany
	Set<Account> accounts;
	
	public void setId(long id){
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	
	public Set<Account> getAccounts(){
		return this.accounts;
	}
}
