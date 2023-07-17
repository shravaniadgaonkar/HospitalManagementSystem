package com.example.hospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.entity.StatusEntity;
import com.example.hospitalManagementSystem.repository.StatusRepository;
import com.example.hospitalManagementSystem.service.StatusService;

@RestController
public class StatusController {
	
	@Autowired
	StatusRepository statusRepository;
	
	@Autowired
	StatusService statusService;
	
	@GetMapping("/hospital/getStatus")
	public ResponseEntity<List<StatusEntity>> getAllStatus(){
		return ResponseEntity.ok(statusService.getAllStatus());
	}

}
