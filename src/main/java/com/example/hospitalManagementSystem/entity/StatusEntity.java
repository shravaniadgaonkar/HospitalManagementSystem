package com.example.hospitalManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class StatusEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
	private Integer statusId;

	private String statusType;
	
	public StatusEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatusEntity(Integer statusId, String statusType) {
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

	@Override
	public String toString() {
		return "statusEntity [statusId=" + statusId + ", statusType=" + statusType + "]";
	}
	
	
}
