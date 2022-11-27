package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Customer;
import com.example.demo.Repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo crepo;

	// save customer
     public Customer saveCustomer(Customer customer) {
		return crepo.save(customer);
	}

		//get all customers
     public List<Customer> getall() {
  	 return crepo.findAll();
 	}

	// get customer by id

 	public Optional<Customer> getById(Integer id) {
 		return crepo.findById(id);
 	}

	// get customers by name
 	public List<Customer> getByName(String name) {
		// TODO Auto-generated method stub
		return crepo.findByName(name);
	}

	
   
 	// update customer
 	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
 		Customer customer2=crepo.getById(customer.getId());
 		customer2.setContact(customer.getContact());
 		customer2.setEmail(customer.getEmail());
 		customer2.setName(customer.getName());
 		customer2.setPassword(customer.getPassword());
 		customer2.setUsername(customer.getUsername());
 	     return 	crepo.save(customer2);
		
	}

	// delete customer
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		crepo.deleteById(id);
	}
		
		
	
}
