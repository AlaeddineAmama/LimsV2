package com.amama.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amama.dao.EquipementRepository;
import com.amama.domain.ApiResponse;
import com.amama.domain.Equipement;



@RestController
@CrossOrigin(origins ="*" , maxAge = 3600)
@RequestMapping("/api/equipement")
public class EquipementController {
	@Autowired
	EquipementRepository equipementRepository ;
	
	
	//@GetMapping("/all")
	@GetMapping("/all")
	public ApiResponse<List<Equipement>>getAllEquipement(){
		try {
		return new 	ApiResponse<>(HttpStatus.OK.value(),"list of Equipement", equipementRepository.findAll());
		}catch(Exception e) {
			return new 	ApiResponse<>(HttpStatus.OK.value(),"list of Equipement NOT FOUND", null);
		}
	}
	
	@GetMapping("/getone/{id}")
	public ApiResponse<Void> getOneEquipement(@PathVariable("id") long id) {
		
		return new ApiResponse<>(HttpStatus.NO_CONTENT.value(), "Equipement  Deleted", equipementRepository.findById(id));
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ApiResponse<Void> delete1(@PathVariable("id") long id) {
		try {
			equipementRepository.deleteById(id);
			return new ApiResponse<>(HttpStatus.NO_CONTENT.value(), "Equipement  Deleted", null);
		}catch(Exception e) {
			
		return new ApiResponse<>(HttpStatus.NO_CONTENT.value(), "Equipement  Deleted", null);

	}
	}
	@PostMapping("/add")
	public ApiResponse<Equipement> save(@RequestBody Equipement equipement) {
		try {	
		
			return new ApiResponse<>(HttpStatus.OK.value(), "equipement saved successfully.",
					equipementRepository.save(equipement));
		} catch (Exception e) {
			System.out.println(e);
			return new ApiResponse<>(HttpStatus.EXPECTATION_FAILED.value(), "equipement not Saved", null);
			
		}
	}
	
	
	@PutMapping("/update")
	public ApiResponse<Equipement> update(@RequestBody Equipement equipement) {
		try {

			return new ApiResponse<>(HttpStatus.OK.value(), "Equipement updated successfully.",
					equipementRepository.save(equipement));
		} catch (Exception e) {
			return new ApiResponse<>(HttpStatus.NOT_FOUND.value(), "Equipement not update ", null);
		}

	}
}
