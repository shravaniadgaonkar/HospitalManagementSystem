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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.dto.PatientDto;
import com.example.hospitalManagementSystem.dto.StaffDto;
import com.example.hospitalManagementSystem.entity.PatientDetailsEntity;
import com.example.hospitalManagementSystem.entity.RolesEntity;
import com.example.hospitalManagementSystem.entity.StaffDetailsEntity;
import com.example.hospitalManagementSystem.entity.StatusEntity;
import com.example.hospitalManagementSystem.repository.BedRepository;
import com.example.hospitalManagementSystem.repository.PatientDetailsRepository;
import com.example.hospitalManagementSystem.repository.RoleRepository;
import com.example.hospitalManagementSystem.repository.StaffDetailsRepository;
import com.example.hospitalManagementSystem.repository.StatusRepository;
import com.example.hospitalManagementSystem.repository.WardRepository;
import com.example.hospitalManagementSystem.service.DoctorService;
import com.example.hospitalManagementSystem.service.NurseService;
import com.example.hospitalManagementSystem.service.PatientDetailsService;
import com.example.hospitalManagementSystem.service.StaffDetailsService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@RestController
public class StaffDetailsController {
	
	@Autowired
	StaffDetailsService staffDetailsService;
	
	@Autowired
	NurseService nurseService;
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	RoleRepository roleRepository;
	
	
	@Autowired
	StaffDetailsRepository staffDetailsRepository;
	
	
	@PostMapping("/hospital/addNewStaff")
	public ResponseEntity<String> addStaff(@RequestBody StaffDto staffDto) {

		StaffDetailsEntity staffDetailsEntity = new StaffDetailsEntity();
		
		staffDetailsEntity.setStaffId(staffDto.getStaffId());
		staffDetailsEntity.setStaffName(staffDto.getStaffName());
		staffDetailsEntity.setStaffEmail(staffDto.getEmail());
		staffDetailsEntity.setDateOfBirth(staffDto.getDateOfBirth());
		staffDetailsEntity.setJoiningDate(staffDto.getJoiningDate());
		staffDetailsEntity.setLastWorkingDate(staffDto.getLastWorkingDate());
		staffDetailsEntity.setUserName(staffDto.getUserName());
		staffDetailsEntity.setStaffPassword(staffDto.getPassword());
		
		staffDetailsEntity.setRoleId(roleRepository.findById(staffDto.getRoleId()).get());
		
		staffDetailsService.saveStaff(staffDetailsEntity);
		
		return ResponseEntity.ok("Staff Added Successfully") ;
	}
	
	
	@GetMapping("/getAllDoctorsList")
	public ResponseEntity<List<StaffDetailsEntity>> getAllDoctors() {
		
		List<StaffDetailsEntity> doctor = doctorService.getAllDoctors();
		
		return ResponseEntity.ok(doctor);
		
	}
	
	@GetMapping("/getAllNurseList")
	public ResponseEntity<List<StaffDetailsEntity>> getAllNurse() {
		
		List<StaffDetailsEntity> nurse = nurseService.getAllNurse();
		
		return ResponseEntity.ok(nurse);
	} 

}
