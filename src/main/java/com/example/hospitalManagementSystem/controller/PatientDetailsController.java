package com.example.hospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.dto.PatientDto;
import com.example.hospitalManagementSystem.entity.PatientDetailsEntity;
import com.example.hospitalManagementSystem.entity.StaffDetailsEntity;
import com.example.hospitalManagementSystem.repository.BedRepository;
import com.example.hospitalManagementSystem.repository.StaffDetailsRepository;
import com.example.hospitalManagementSystem.repository.StatusRepository;
import com.example.hospitalManagementSystem.service.PatientDetailsService;

@RestController
public class PatientDetailsController {
	
	@Autowired
	PatientDetailsService patientDetailsService;
	
	@Autowired
	StaffDetailsRepository staffDetailsRepository;
	
	@Autowired
	BedRepository bedRepository;
	
	@Autowired
	StatusRepository statusRepository;
	
	@PostMapping("/hospital/addNewPatient")
	public ResponseEntity<String> addNewPatient(@RequestBody PatientDto patientDto) {
	
		PatientDetailsEntity patientDetailsEntity = new PatientDetailsEntity();
		
		patientDetailsEntity.setPatientId(patientDto.getPatientId());
		patientDetailsEntity.setPatientName(patientDto.getPatientName());
		patientDetailsEntity.setAge(patientDto.getAge());
		patientDetailsEntity.setAdmitDate(patientDto.getAdmitDate());
		patientDetailsEntity.setPatientBedNumber(bedRepository.findById(patientDto.getPatientBedNumber()).get());
		
		StaffDetailsEntity doctor = staffDetailsRepository.findByStaffName(patientDto.getStaffId());
		if(doctor.getRoleId().getRoleId().equals(2)) {
			patientDetailsEntity.setDoctorName(doctor);
		}
		patientDetailsEntity.setStatus(statusRepository.findById(patientDto.getStatus()).get());
		patientDetailsEntity.setExpenses(patientDto.getExpenses());
		
		patientDetailsService.savePatient(patientDetailsEntity);

		return ResponseEntity.ok("Patient Added Successfully");
		
	}
	
	@GetMapping("/getAllPatientDetails")
	public ResponseEntity<List<PatientDetailsEntity>> getAllPatient() {
		
		return ResponseEntity.ok(patientDetailsService.getAllPatient());
		
	}
	
	@PutMapping("/hospital/patient/{patientId}/discharge")
	public ResponseEntity<String> dischargePatient(@PathVariable("patientId") Integer patientId){
		
		patientDetailsService.dischargePatient(patientId);
		
		return ResponseEntity.ok("Patient discharged!");
		
	}
	
	
	@GetMapping("/hospital/admittedPatient")
	public ResponseEntity<List<PatientDetailsEntity>> getAdmittedPatient(){
		
		return ResponseEntity.ok(patientDetailsService.getAdmittedPatients());
		
	}
	

}
