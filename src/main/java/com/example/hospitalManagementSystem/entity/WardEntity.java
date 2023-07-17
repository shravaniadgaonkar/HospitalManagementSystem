package com.example.hospitalManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ward")
public class WardEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
	private Integer wardId;
	
	private String wardName;
	
	private Integer totalRooms;
	

	public WardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WardEntity(Integer wardId, String wardName, Integer totalRooms) {
		super();
		this.wardId = wardId;
		this.wardName = wardName;
		this.totalRooms = totalRooms;
	}

	public Integer getWardId() {
		return wardId;
	}

	public void setWardId(Integer wardId) {
		this.wardId = wardId;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public Integer getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(Integer totalRooms) {
		this.totalRooms = totalRooms;
	}
	
	@Override
	public String toString() {
		return "wardEntity [wardId=" + wardId + ", wardName=" + wardName + ", totalRooms=" + totalRooms + "]";
	}
	

}
