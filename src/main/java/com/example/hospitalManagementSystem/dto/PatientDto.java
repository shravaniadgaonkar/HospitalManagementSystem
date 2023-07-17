package com.example.hospitalManagementSystem.dto;

import java.sql.Date;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.hospitalManagementSystem.entity.BedsEntity;
import com.example.hospitalManagementSystem.entity.StaffDetailsEntity;
import com.example.hospitalManagementSystem.entity.StatusEntity;

public class PatientDto {
	
	private Integer patientId;
	
	private String patientName;
	
	private Integer age;
	
	private Integer patientBedNumber;
	
	private Date admitDate;
	
	private String staffId;
	
	private Integer status;
	
	private Double expenses;

	public PatientDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PatientDto(Integer patientId, String patientName, Integer age, Integer patientBedNumber, Date admitDate,
			String staffId, Integer status, Double expenses) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.patientBedNumber = patientBedNumber;
		this.admitDate = admitDate;
		this.staffId = staffId;
		this.status = status;
		this.expenses = expenses;
	}


	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}

	public Integer getPatientBedNumber() {
		return patientBedNumber;
	}

	public void setPatientBedNumber(Integer patientBedNumber) {
		this.patientBedNumber = patientBedNumber;
	}

	public Double getExpenses() {
		return expenses;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getStaffId() {
		return staffId;
	}


	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
	

}
