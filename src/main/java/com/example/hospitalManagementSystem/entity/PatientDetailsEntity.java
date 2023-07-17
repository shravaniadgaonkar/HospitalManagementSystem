package com.example.hospitalManagementSystem.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patientdetails")
public class PatientDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
	private Integer patientId;
	
	private String patientName;
	
	private Integer age;
	
	@OneToOne
	@JoinColumn(name = "patient_Bed_Number")//, referencedColumnName = "bed_Id"
	private BedsEntity patientBedNumber;
	
	private Date admitDate;
	
	@OneToOne
	@JoinColumn(name = "doctor_Name")//, referencedColumnName = "staff_Id"
	private StaffDetailsEntity doctorName;
	
	private Double expenses;
		
	@OneToOne
	@JoinColumn(name = "patient_Status")//, referencedColumnName = "status_Id"
	private StatusEntity status;

	public PatientDetailsEntity(Integer patientId, String patientName, Integer age, BedsEntity patientBedNumber,
			Date admitDate, StaffDetailsEntity staff, Double expenses, StatusEntity status) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.patientBedNumber = patientBedNumber;
		this.admitDate = admitDate;
		this.doctorName = staff;
		this.expenses = expenses;
		this.status = status;
	}

	public PatientDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
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
	

	public BedsEntity getPatientBedNumber() {
		return patientBedNumber;
	}

	public void setPatientBedNumber(BedsEntity patientBedNumber) {
		this.patientBedNumber = patientBedNumber;
	}

	public StatusEntity getStatus() {
		return status;
	}

	public void setStatus(StatusEntity status) {
		this.status = status;
	}
	

	public Double getExpenses() {
		return expenses;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	public StaffDetailsEntity getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(StaffDetailsEntity doctorName) {
		this.doctorName = doctorName;
	}

	@Override
	public String toString() {
		return "PatientDetailsEntity [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age
				+ ", patientBedNumber=" + patientBedNumber + ", admitDate=" + admitDate + ", staff=" + doctorName
				+ ", expenses=" + expenses + ", status=" + status + "]";
	}
	
	
	
}
