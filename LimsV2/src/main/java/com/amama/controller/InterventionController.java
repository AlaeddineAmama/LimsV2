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
import com.amama.dao.InterventionRepository;
import com.amama.domain.ApiResponse;
import com.amama.domain.Intervention;



@RestController
@CrossOrigin(origins ="*" , maxAge = 3600)
@RequestMapping("/api/intervention")
public class InterventionController {
	@Autowired
	InterventionRepository interventionRepository ;
	
	@GetMapping("/all")
	public ApiResponse<List<Intervention>>getAllIntervention(){
		try {
		return new 	ApiResponse<>(HttpStatus.OK.value(),"list of Intervention", interventionRepository.findAll());
		}catch(Exception e) {
			return new 	ApiResponse<>(HttpStatus.OK.value(),"list of Intervention NOT FOUND", null);
		}
	}
	
	@GetMapping("/getone/{id}")
	public ApiResponse<Void> getOneIntervention(@PathVariable("id") long id) {
		
		return new ApiResponse<>(HttpStatus.NO_CONTENT.value(), "Intervention  ", interventionRepository.findById(id));
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ApiResponse<Void> delete1(@PathVariable("id") long id) {
		try {
			interventionRepository.deleteById(id);
			return new ApiResponse<>(HttpStatus.NO_CONTENT.value(), "Intervention  Deleted", null);
		}catch(Exception e) {
			
		return new ApiResponse<>(HttpStatus.NO_CONTENT.value(), "Intervention  Deleted", null);

	}
	}
	@PostMapping("/add")
	public ApiResponse<Intervention> save(@RequestBody Intervention intervention) {
		try {	
		
			return new ApiResponse<>(HttpStatus.OK.value(), "intervention saved successfully.",
					interventionRepository.save(intervention));
		} catch (Exception e) {
			System.out.println(e);
			return new ApiResponse<>(HttpStatus.EXPECTATION_FAILED.value(), "intervention not Saved", null);
			
		}
	}
	
	
	@PutMapping("/update")
	public ApiResponse<Intervention> update(@RequestBody Intervention intervention) {
		try {

			return new ApiResponse<>(HttpStatus.OK.value(), "intervention updated successfully.",
					interventionRepository.save(intervention));
		} catch (Exception e) {
			return new ApiResponse<>(HttpStatus.NOT_FOUND.value(), "intervention not update ", null);
		}

	}
}
