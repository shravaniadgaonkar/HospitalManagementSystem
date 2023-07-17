package com.example.hospitalManagementSystem.dto;

public class RolesDto {
	
	private Integer roleId;
	
	private String roleType;

	public RolesDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RolesDto(Integer roleId, String roleType) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
