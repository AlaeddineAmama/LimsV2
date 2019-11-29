package com.amama.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.amama.dao.UserAppRepository;
import com.amama.domain.ApiResponse;
import com.amama.domain.UserApp;

public class UserAppController {
	@Autowired
	UserAppRepository userAppRepository ;
	
	@GetMapping("/all")
	public ApiResponse<List<UserApp>>  getAllUsers() {
		return new ApiResponse<>(HttpStatus.OK.value(),"list of users", userAppRepository.findAll());
		}
	
	
	@GetMapping("/{id}")
	public ApiResponse<UserApp> getOneUser(@PathVariable Long id){
		return new ApiResponse<>(HttpStatus.OK.value(),"user exist", userAppRepository.findById(id));
	}
	
	
	@PostMapping("/create")
	public ApiResponse<UserApp> createUsert(@PathVariable UserApp user) {
		return new ApiResponse<>(HttpStatus.ACCEPTED.value(),"user created" ,userAppRepository.save(user));
	}
	
	
	@PutMapping("/update")
	public ApiResponse<UserApp> updateUser(@PathVariable UserApp user){
		return new ApiResponse<>(HttpStatus.ACCEPTED.value(),"user updated", userAppRepository.save(user));
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ApiResponse<Void> deleteUser(@PathVariable long id) {
		userAppRepository.deleteById(id);
		return new ApiResponse<>(HttpStatus.OK.value(),"user deleted",null);

	}
	
	
}
