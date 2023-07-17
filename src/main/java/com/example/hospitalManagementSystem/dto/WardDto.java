package com.example.hospitalManagementSystem.dto;

public class WardDto {
	
	private Integer wardId;
	
	private String wardName;
	
	private Integer totalRooms;

	public WardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WardDto(Integer wardId, String wardName, Integer totalRooms) {
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

}
