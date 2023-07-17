package com.example.hospitalManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalManagementSystem.entity.WardEntity;
import com.example.hospitalManagementSystem.repository.WardRepository;

@Service
public class WardService {
	
	@Autowired
	WardRepository wardRepository;
	
	public List<WardEntity> getWardList(){
		return wardRepository.findAll();
	}

}
