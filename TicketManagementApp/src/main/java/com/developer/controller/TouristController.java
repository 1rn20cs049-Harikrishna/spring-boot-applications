package com.developer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.model.Tourist;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/tourist")
public class TouristController {
	
	@PostMapping
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist) {
	
		
		return null;
	}
	

}
