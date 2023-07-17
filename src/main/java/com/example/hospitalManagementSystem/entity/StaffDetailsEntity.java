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
@Table(name = "staffdetails")
public class StaffDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
	private Integer staffId;
	
	private String staffName;
	
	private Date dateOfBirth;
	
	private String staffEmail;
	
	private String userName;
	
	private String staffPassword;
	
	@OneToOne
	@JoinColumn(name = "role_Id")//, referencedColumnName = "role_Id"
	private RolesEntity roleId;
	
	private Date joiningDate;
	
	private Date lastWorkingDate;

	public StaffDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public String getStaffPassword() {
		return staffPassword;
	}

	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}

	public RolesEntity getRoleId() {
		return roleId;
	}

	public void setRoleId(RolesEntity roleId) {
		this.roleId = roleId;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public StaffDetailsEntity(Integer staffId, String staffName, Date dateOfBirth, String staffEmail, String userName,
			String staffPassword, RolesEntity roleId, Date joiningDate, Date lastWorkingDate) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.dateOfBirth = dateOfBirth;
		this.staffEmail = staffEmail;
		this.userName = userName;
		this.staffPassword = staffPassword;
		this.roleId = roleId;
		this.joiningDate = joiningDate;
		this.lastWorkingDate = lastWorkingDate;
	}
	
	@Override
	public String toString() {
		return "StaffDetailsEntity [staffId=" + staffId + ", staffName=" + staffName + ", dateOfBirth=" + dateOfBirth
				+ ", staffEmail=" + staffEmail + ", userName=" + userName + ", staffPassword=" + staffPassword
				+ ", roleId=" + roleId + ", joiningDate=" + joiningDate + ", lastWorkingDate=" + lastWorkingDate + "]";
	}
	

}
