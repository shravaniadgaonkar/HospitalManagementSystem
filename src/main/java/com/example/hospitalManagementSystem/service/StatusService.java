package com.example.hospitalManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalManagementSystem.entity.StatusEntity;
import com.example.hospitalManagementSystem.repository.StatusRepository;

@Service
public class StatusService {
	
	@Autowired
	StatusRepository statusRepository;
	
	public List<StatusEntity> getAllStatus(){
		return statusRepository.findAll();
	}

}
