package com.tutorial.uservalidation.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.tutorial.uservalidation.model.User;
import com.tutorial.uservalidation.services.UserServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserControler {
	
	
	@Autowired
	private UserServices userservices;
	
	
	@PostMapping
	public String addUser(@Valid @RequestBody User user ) {
		
		return userservices.saveUser(user);
		
		
		
	}
	@GetMapping
	
	public ArrayList<User> getAllUser() {
		return userservices.retriveAllUsers();
	}
	
	@GetMapping("{userid}")
	public User getUserById(@Valid @PathVariable("userid") String userid){
		
		return userservices.findUserById(userid);
	}
	
	@PutMapping("{userid}")
	public String updateUserInfo(@Valid @PathVariable("userid") String userid, @Valid @RequestBody User user) {
		
		return userservices.updateUserInfo(userid,user);
	}
	
	@DeleteMapping("{userid}")
	
	public String deleteUserInfo(@Valid @PathVariable("userid")String userid) {
		
		return userservices.removeUserById(userid);
	}
		
		
	

	
}
