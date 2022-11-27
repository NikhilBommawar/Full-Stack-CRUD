package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

@Query("SELECT customer FROM Customer customer WHERE customer.name=?1")
	public List<Customer> findByName(String name);

}
