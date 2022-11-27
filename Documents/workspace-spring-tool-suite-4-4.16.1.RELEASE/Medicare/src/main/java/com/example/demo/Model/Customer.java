package com.example.demo.Model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "user")
@Data
public class Customer {


      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String contact;
	private String username;
	private String password;
	private String userType;
	
	
	
	
	public Customer() {
		super();
	}




	public Customer(String name, String email, String contact, String username, String password,String userType) {
		super();
		
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.username = username;
		this.password = password;
		this.userType = userType;
	}




	public int getId() {
		return id;
	}






	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getContact() {
		return contact;
	}




	public void setContact(String contact) {
		this.contact = contact;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getUserType() {
		return userType;
	}




	public void setUserType(String userType) {
		this.userType = userType;
	}




	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", username="
				+ username + ", password=" + password + "]";
	}
	
	
	
	
}
