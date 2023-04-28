package com.tutorial.uservalidation.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.tutorial.uservalidation.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Repository
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserRepository {
	
	
	private ArrayList<User>userList=new ArrayList<>();
	
	

}
