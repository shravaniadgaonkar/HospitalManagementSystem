package com.example.hospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.entity.WardEntity;
import com.example.hospitalManagementSystem.service.WardService;

@RestController
public class WardController {
	
	@Autowired
	WardService wardService;
	
	
	@GetMapping("/hospital/wardList")
	public ResponseEntity<List<WardEntity>> getAllWards(){
		return ResponseEntity.ok(wardService.getWardList());
	}

}
