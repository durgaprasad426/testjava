package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.beans.Company;
import com.nt.beans.Customer;

@RestController
public class TestController {

	@PostMapping("/data")
	public ResponseEntity<String>showData(@RequestBody Customer customer){
		
		System.out.println(customer);
		return new ResponseEntity<String>(customer.toString(),HttpStatus.OK);
	}
}
