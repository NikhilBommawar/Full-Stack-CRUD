package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Integer> {

	@Query("SELECT medicine from Medicine medicine WHERE medicine.name=?1")
	public List<Medicine> findByName(String name);

}
