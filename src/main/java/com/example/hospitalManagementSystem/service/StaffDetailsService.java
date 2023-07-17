package com.example.hospitalManagementSystem.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.hospitalManagementSystem.entity.PatientDetailsEntity;
import com.example.hospitalManagementSystem.entity.StaffDetailsEntity;
import com.example.hospitalManagementSystem.entity.StatusEntity;
import com.example.hospitalManagementSystem.repository.PatientDetailsRepository;
import com.example.hospitalManagementSystem.repository.StaffDetailsRepository;

@Service
public class StaffDetailsService {
	@Autowired
	StaffDetailsRepository staffDetailsRepository;
	
	@Autowired
	PatientDetailsRepository patientDetailsRepository;
	
	public StaffDetailsEntity saveStaff(StaffDetailsEntity staffDetailsEntity) {
		
		StaffDetailsEntity staff = staffDetailsRepository.save(staffDetailsEntity);
		
		return staff;
	}
	
	public List<StaffDetailsEntity> getAllStaffList(){
		
		List<StaffDetailsEntity> list = staffDetailsRepository.findAll();
		
		Pageable pageable = (Pageable) PageRequest.ofSize(20);
		
		return list;
	}
	
}
