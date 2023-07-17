package com.example.hospitalManagementSystem.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.hospitalManagementSystem.entity.WardEntity;

public class BedDto {
	
	private Integer bedId;
	
	private Integer roomNumber;
	
	private Integer bedNumber;
	
	private Integer priceOfBed;
	
	private Integer wardId;

	public BedDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BedDto(Integer bedId, Integer roomNumber, Integer bedNumber, Integer priceOfBed, Integer wardId) {
		super();
		this.bedId = bedId;
		this.roomNumber = roomNumber;
		this.bedNumber = bedNumber;
		this.priceOfBed = priceOfBed;
		this.wardId = wardId;
	}



	public Integer getBedId() {
		return bedId;
	}

	public void setBedId(Integer bedId) {
		this.bedId = bedId;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Integer getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(Integer bedNumber) {
		this.bedNumber = bedNumber;
	}

	public Integer getPriceOfBed() {
		return priceOfBed;
	}

	public void setPriceOfBed(Integer priceOfBed) {
		this.priceOfBed = priceOfBed;
	}

	public Integer getWardId() {
		return wardId;
	}

	public void setWardId(Integer wardId) {
		this.wardId = wardId;
	}
	
	
	

}
