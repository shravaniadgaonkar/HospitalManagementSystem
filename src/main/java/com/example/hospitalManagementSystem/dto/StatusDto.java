package com.example.hospitalManagementSystem.dto;

public class StatusDto {
	
	private Integer statusId;

	private String statusType;

	public StatusDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatusDto(Integer statusId, String statusType) {
		super();
		this.statusId = statusId;
		this.statusType = statusType;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusType() {
		return statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	

}
