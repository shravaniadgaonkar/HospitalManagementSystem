package com.example.hospitalManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalManagementSystem.entity.PatientDetailsEntity;
import com.example.hospitalManagementSystem.entity.StaffDetailsEntity;

@Repository
public interface PatientDetailsRepository extends JpaRepository<PatientDetailsEntity, Integer>{
	
	List<PatientDetailsEntity> findByStatusStatusType(String statusType);
	
	
}
