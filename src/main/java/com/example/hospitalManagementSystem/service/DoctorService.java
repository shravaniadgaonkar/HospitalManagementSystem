package com.example.hospitalManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalManagementSystem.entity.PatientDetailsEntity;
import com.example.hospitalManagementSystem.entity.StaffDetailsEntity;
import com.example.hospitalManagementSystem.repository.PatientDetailsRepository;
import com.example.hospitalManagementSystem.repository.StaffDetailsRepository;

@Service
public class DoctorService {
	@Autowired
	PatientDetailsRepository patientDetailsRepository;
	
	
	@Autowired
	StaffDetailsRepository staffDetailsRepository;
	
	public PatientDetailsEntity getPatientById(Integer id) {
		return patientDetailsRepository.findById(id).get();
	}
	
	public List<StaffDetailsEntity> getAllDoctors(){
		
		List<StaffDetailsEntity> listDoctor = staffDetailsRepository.findAllByRoleIdRoleType("Doctor");
		
		return listDoctor;
		
	}
}
