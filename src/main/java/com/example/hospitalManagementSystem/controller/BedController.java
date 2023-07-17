package com.example.hospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.dto.BedDto;
import com.example.hospitalManagementSystem.entity.BedsEntity;
import com.example.hospitalManagementSystem.repository.WardRepository;
import com.example.hospitalManagementSystem.service.BedService;

@RestController
public class BedController {
	
	@Autowired
	BedService bedService;
	
	@Autowired
	WardRepository wardRepository;

	@PostMapping("/hospital/addNewBed")
	public ResponseEntity<String> addnewBed(@RequestBody BedDto bedDto) {
		
		BedsEntity bedsEntity = new BedsEntity();
		
		bedsEntity.setBedId(bedDto.getBedId());
		bedsEntity.setBedNumber(bedDto.getBedNumber());
		bedsEntity.setRoomNumber(bedDto.getRoomNumber());
		bedsEntity.setPriceOfBed(bedDto.getPriceOfBed());
		bedsEntity.setWard(wardRepository.findById(bedDto.getWardId()).get());
		
		bedService.saveBed(bedsEntity);
		
		return ResponseEntity.ok("Bed Added Succesfully");
		
	}
	
}
