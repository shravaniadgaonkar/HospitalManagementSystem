package com.example.hospitalManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalManagementSystem.entity.StaffDetailsEntity;

@Repository
public interface StaffDetailsRepository extends JpaRepository<StaffDetailsEntity, Integer>{
	
	StaffDetailsEntity findByUserName(String userName);
	
	List<StaffDetailsEntity> findAllByRoleIdRoleType(String roleType);
	
	StaffDetailsEntity findByStaffName(String string);


}
