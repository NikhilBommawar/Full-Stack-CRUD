package com.example.demo.Conrtoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

	@Autowired
	CustomerService cservice;
	
	// save customer
	@PostMapping("insert")
	public Customer saveCustomer(@RequestBody Customer customer  ) {
		return cservice.saveCustomer(customer);
	}
	
	
	
	//get all customers
	@GetMapping("readall")
	public List<Customer> getall(){
		return cservice.getall();
	}
	
	// get customer by id
	@GetMapping("getbyid/{id}")
	public Optional<Customer> getById(@PathVariable Integer id) {
		return cservice.getById(id);
	}
	
	
	// get customers by name
	@GetMapping("getByName/{name}")
	public List<Customer> getByName(@PathVariable String name) {
		return cservice.getByName(name);
	}
	
	// update customer
	@PutMapping("updateCustomer")
	public void updateCustomer(@RequestBody Customer customer) {
		cservice.updateCustomer(customer);
	}
	
	// delete customer
	@DeleteMapping("deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		cservice.deleteCustomer(id);
	}
	
	
}
