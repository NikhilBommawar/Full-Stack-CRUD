package com.example.demo.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

public class PurchaseOrder {
	
	private int id;
	private float totalprice;
	@CreationTimestamp
	private LocalDate date;
	
	@OneToMany
	private List<Medicine> medicines=new ArrayList<>();
	
	@ManyToOne
	private Customer customer;

	public PurchaseOrder() {
		super();
	}

	public PurchaseOrder(float totalprice, LocalDate date, List<Medicine> medicines, Customer customer) {
		super();
		this.totalprice = totalprice;
		this.date = date;
		this.medicines = medicines;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}


	public float getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Medicine> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [id=" + id + ", totalprice=" + totalprice + ", date=" + date + ", medicines=" + medicines
				+ ", customer=" + customer + "]";
	}
	

}
