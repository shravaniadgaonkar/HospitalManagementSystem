package com.example.hospitalManagementSystem.controller;

import java.util.List;

import javax.management.relation.RoleStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.dto.RolesDto;
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
	
	@PostMapping("/hospital/addNewRole")
	public ResponseEntity<String> addnewRole(@RequestBody RolesDto rolesDto){
		
		RolesEntity rolesEntity = new RolesEntity();
		
		rolesEntity.setRoleId(rolesDto.getRoleId());
		rolesEntity.setRoleType(rolesDto.getRoleType());
		
		roleService.saveRole(rolesEntity);
		
		return ResponseEntity.ok("Role added successfully!");
	}

}
