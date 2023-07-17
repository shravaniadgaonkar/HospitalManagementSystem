package com.example.hospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.dto.WardDto;
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
	
	@PostMapping("/hospital/addWard")
	public ResponseEntity<String> saveNewWard(@RequestBody WardDto wardDto){
		
		WardEntity wardEntity = new WardEntity();
		
		wardEntity.setWardId(wardDto.getWardId());
		wardEntity.setWardName(wardDto.getWardName());
		wardEntity.setTotalRooms(wardDto.getTotalRooms());
		
		wardService.saveWard(wardEntity);
		
		return ResponseEntity.ok("Ward Added Successfully!");
	}

}
