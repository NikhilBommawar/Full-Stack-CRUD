package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Medicine;
import com.example.demo.Repo.MedicineRepo;

@Service
public class MedicineService {
	
	@Autowired
	MedicineRepo mrepo;
	// save medicine
    public Medicine saveMedicine(Medicine medicine) {
		return mrepo.save(medicine);
	}

		//get all Medicines
    public List<Medicine> getall() {
 	 return mrepo.findAll();
	}

	// get medicine by id

	public Optional<Medicine> getById(Integer id) {
		return mrepo.findById(id);
	}

	// get medicines by name
	public List<Medicine> getByName(String name) {
		// TODO Auto-generated method stub
		return mrepo.findByName(name);
	}

	
  
	// update medicine
	public Medicine updatemedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		Medicine medicine2=mrepo.getById(medicine.getId());
		medicine2.setPrice(medicine.getPrice());
		medicine2.setDescription(medicine.getDescription());
		medicine2.setRating(medicine.getRating());
		
	     return mrepo.save(medicine2);
		
	}

	// delete medicine
	public void deletemedicine(Integer id) {
		// TODO Auto-generated method stub
		mrepo.deleteById(id);
	}
		

}
