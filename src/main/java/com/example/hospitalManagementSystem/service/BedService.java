package com.example.hospitalManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalManagementSystem.entity.BedsEntity;
import com.example.hospitalManagementSystem.repository.BedRepository;

@Service
public class BedService {
	
	@Autowired
	BedRepository bedRepository;
	
	public BedsEntity saveBed(BedsEntity bedsEntity) {
		
		BedsEntity bed = bedRepository.save(bedsEntity);
		
		return bed;
		
	}

}
