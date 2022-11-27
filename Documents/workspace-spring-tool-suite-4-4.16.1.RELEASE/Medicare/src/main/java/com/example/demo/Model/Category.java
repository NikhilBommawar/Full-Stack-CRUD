package com.example.demo.Model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String category;
	
	@OneToMany(mappedBy = "category")
	private List<Medicine> medicines=new ArrayList<>();
	
	public Category() {
		super();
	}

	public Category(int id, String category) {
		super();
		this.id = id;
		this.category = category;
	}

	public int getId() {
		return id;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	
	public List<Medicine> getMedicines() {
		return medicines;
	}

	public void setMedicine(Medicine medicine) {
		this.medicines.add(medicine);
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", category=" + category + "]";
	}

}
