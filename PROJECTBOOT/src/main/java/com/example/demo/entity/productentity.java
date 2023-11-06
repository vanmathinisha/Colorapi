package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class productentity {
@Id	
	private String name;
	private int id;
	private String MobileNumber;
	private String Email;
	private String Address;
	private String CarModel;
	private int VehicleRegNo;
	private int EngineNo;
	private String RegDate;
	private int NoOfKeys;
	private boolean OwnersManual;
	private int CurrentMileage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public int getVehicleRegNo() {
		return VehicleRegNo;
	}
	public void setVehicleRegNo(int vehicleRegNo) {
		VehicleRegNo = vehicleRegNo;
	}
	public int getEngineNo() {
		return EngineNo;
	}
	public void setEngineNo(int engineNo) {
		EngineNo = engineNo;
	}
	public String getRegDate() {
		return RegDate;
	}
	public void setRegDate(String regDate) {
		RegDate = regDate;
	}
	public int getNoOfKeys() {
		return NoOfKeys;
	}
	public void setNoOfKeys(int noOfKeys) {
		NoOfKeys = noOfKeys;
	}
	public boolean isOwnersManual() {
		return OwnersManual;
	}
	public void setOwnersManual(boolean ownersManual) {
		OwnersManual = ownersManual;
	}
	public int getCurrentMileage() {
		return CurrentMileage;
	}
	public void setCurrentMileage(int currentMileage) {
		CurrentMileage = currentMileage;
	}
	public productentity(String name, int id, String mobileNumber, String email, String address, String carModel,
			int vehicleRegNo, int engineNo, String regDate, int noOfKeys, boolean ownersManual, int currentMileage) {
		super();
		this.name = name;
		this.id = id;
		MobileNumber = mobileNumber;
		Email = email;
		Address = address;
		CarModel = carModel;
		VehicleRegNo = vehicleRegNo;
		EngineNo = engineNo;
		RegDate = regDate;
		NoOfKeys = noOfKeys;
		OwnersManual = ownersManual;
		CurrentMileage = currentMileage;
	}
	public productentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
