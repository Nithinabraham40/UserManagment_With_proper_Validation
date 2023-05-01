package com.tutorial.uservalidation.exceptionhandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public HashMap<String,String> invalidArgumentException(MethodArgumentNotValidException exception){
		
		HashMap<String,String>errorHandlingMap=new HashMap<>();
		
		List<FieldError>fielderror=exception.getBindingResult().getFieldErrors();
		
		for(FieldError error:fielderror) {
			
			errorHandlingMap.put(error.getField(),error.getDefaultMessage());
		}
		
		return errorHandlingMap;
		
	}
	
	
	
	
	
	
	
	

}
