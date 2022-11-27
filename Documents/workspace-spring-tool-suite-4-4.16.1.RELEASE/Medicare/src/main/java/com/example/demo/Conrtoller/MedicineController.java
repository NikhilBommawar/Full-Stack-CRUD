package com.example.demo.Conrtoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Medicine;
import com.example.demo.service.MedicineService;


@RestController
public class MedicineController {

	@Autowired
	MedicineService mservice;
	
	// save Medicine
	@PostMapping("insertmedicine")
	public Medicine saveMedicine(@RequestBody Medicine medicine  ) {
		return mservice.saveMedicine(medicine);
	}
	
	
	
	//get all Medicines
	@GetMapping("readallmedicine")
	public List<Medicine> getall(){
		return mservice.getall();
	}
	
	// get Medicine by id
	@GetMapping("getmedicinebyid/{id}")
	public Optional<Medicine> getById(@PathVariable Integer id) {
		return mservice.getById(id);
	}
	
	
	// get Medicines by name
	@GetMapping("getmedicineByName/{name}")
	public List<Medicine> getByName(@PathVariable String name) {
		return mservice.getByName(name);
	}
	
	// update Medicine
	@PostMapping("updateMedicine")
	public void updateMedicine(@RequestBody Medicine medicine) {
		mservice.updatemedicine(medicine);
	}
	
	// delete Medicine
	@DeleteMapping("deleteMedicine/{id}")
	public void deleteMedicine(@PathVariable Integer id) {
		mservice.deletemedicine(id);
	}
	
	
}
