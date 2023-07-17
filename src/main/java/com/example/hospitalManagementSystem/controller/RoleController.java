package com.example.hospitalManagementSystem.controller;

import java.util.List;

import javax.management.relation.RoleStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.entity.RolesEntity;
import com.example.hospitalManagementSystem.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@GetMapping("/hospital/getRoles")
	public ResponseEntity<List<RolesEntity>> getAllRole(){
		
		List<RolesEntity> list = roleService.getAllRoles();
		
		return ResponseEntity.ok(list);
	}

}
