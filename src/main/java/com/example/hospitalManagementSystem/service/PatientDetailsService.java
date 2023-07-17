package com.example.hospitalManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.hospitalManagementSystem.entity.PatientDetailsEntity;
import com.example.hospitalManagementSystem.entity.StatusEntity;
import com.example.hospitalManagementSystem.repository.PatientDetailsRepository;

@Service
public class PatientDetailsService {

	@Autowired
	PatientDetailsRepository patientDetailsRepository;

	public PatientDetailsEntity savePatient(PatientDetailsEntity patientDetailsEntity) {

		PatientDetailsEntity patient = patientDetailsRepository.save(patientDetailsEntity);

		return patient;
	}

	public List<PatientDetailsEntity> getAllPatient() {

		List<PatientDetailsEntity> list = patientDetailsRepository.findAll();

		return list;
	}

	public PatientDetailsEntity getPatient(Integer id) {

		PatientDetailsEntity patient = patientDetailsRepository.findById(id).get();

		return patient;
	}

	public void dischargePatient(Integer patientId) {

		PatientDetailsEntity patientDetailsEntity = patientDetailsRepository.findById(patientId).orElse(null);

		try {
			if (patientDetailsEntity != null) {
				StatusEntity statusEntity = new StatusEntity();
				statusEntity.setStatusId(2);
				patientDetailsEntity.setStatus(statusEntity);
				patientDetailsRepository.save(patientDetailsEntity);
			}
			else {
				ResponseEntity.ok("Something is wrong");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			ResponseEntity.ok("Something is wrong");
			e.printStackTrace();
		}
	}
	
	 public List<PatientDetailsEntity> getAdmittedPatients() {
	     
		 return patientDetailsRepository.findByStatusStatusType("admitted");
		 
	 }

}
