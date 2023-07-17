package com.example.hospitalManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.dto.StaffDto;
import com.example.hospitalManagementSystem.entity.StaffDetailsEntity;
import com.example.hospitalManagementSystem.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	StaffDetailsEntity staffDetailsEntity = new StaffDetailsEntity();
	
	
	@PostMapping("/login")
	public ResponseEntity<String> checkCredentials(@RequestBody StaffDto staffDto) {
		
		StaffDetailsEntity staffDetailsEntity = new StaffDetailsEntity();
		
		boolean flag = loginService.checkCredentials(staffDto);
//		boolean flag = loginDto.success;
//		String roleType = loginDto.roleType;
		
		if(flag == true) { 
			return ResponseEntity.ok("User logged in successfully!");
		}
		else {
			return ResponseEntity.ok("Something is wrong, please try again later");
		}
	}

}
