package com.example.hospitalManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "beds")
public class BedsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
	private Integer bedId;
	
	private Integer roomNumber;
	
	@OneToOne
	@JoinColumn(name = "ward_Id")//, referencedColumnName = "ward_Id"
	private WardEntity ward;
	
	private Integer bedNumber;
	
	private Integer priceOfBed;
	

	public BedsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BedsEntity(Integer bedId, Integer roomNumber, WardEntity ward, Integer bedNumber, Integer priceOfBed) {
		super();
		this.bedId = bedId;
		this.roomNumber = roomNumber;
		this.ward = ward;
		this.bedNumber = bedNumber;
		this.priceOfBed = priceOfBed;
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
	
	public WardEntity getWard() {
		return ward;
	}

	public void setWard(WardEntity ward) {
		this.ward = ward;
	}

	@Override
	public String toString() {
		return "BedsEntity [bedId=" + bedId + ", roomNumber=" + roomNumber + ", ward=" + ward + ", bedNumber="
				+ bedNumber + ", priceOfBed=" + priceOfBed + "]";
	}
	
}
