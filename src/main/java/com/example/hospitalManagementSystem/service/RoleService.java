package com.example.hospitalManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalManagementSystem.entity.RolesEntity;
import com.example.hospitalManagementSystem.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository roleRepository;
	
	public List<RolesEntity> getAllRoles(){
		return roleRepository.findAll();
	}

}
