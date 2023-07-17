package com.example.hospitalManagementSystem.dto;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.hospitalManagementSystem.entity.RolesEntity;

public class StaffDto {


	public boolean success;
	
	public String roleType;
	
	private Integer staffId;
	
	private String staffName;
	
	private Date dateOfBirth;
	
	private String email;
	
	private String userName;
	
	private String password;
	
	private Date joiningDate;
	
	private Date lastWorkingDate;
	
	private Integer roleId;

	public StaffDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public StaffDto(Integer staffId, String staffName, Date dateOfBirth, String email,
			String userName, String password, Date joiningDate, Date lastWorkingDate, Integer roleId) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.joiningDate = joiningDate;
		this.lastWorkingDate = lastWorkingDate;
		this.roleId = roleId;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getLastWorkingDate() {
		return lastWorkingDate;
	}

	public void setLastWorkingDate(Date lastWorkingDate) {
		this.lastWorkingDate = lastWorkingDate;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	
	
}
