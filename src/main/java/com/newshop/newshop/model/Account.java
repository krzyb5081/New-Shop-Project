package com.newshop.newshop.model;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	long id;
	String nickname;
	String password;

	@ManyToOne
	Customer customer;
	
	public void setId(long id){
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getNickname() {
		return this.nickname;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
}
