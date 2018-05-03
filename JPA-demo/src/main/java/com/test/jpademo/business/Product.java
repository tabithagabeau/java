package com.test.jpademo.business;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int vendorID; 
	private String vendorPartNumber;
	private String name;
	private double price;
	private String unit;
	private String photoPath;
	
	public Product() {
		//empty constructor
	}

	

	public Product(int id, int vendorID, String vendorPartNumber, String name, double price, String unit,
			String photoPath) {
		super();
		this.id = id;
		this.vendorID = vendorID;
		this.vendorPartNumber = vendorPartNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
	}

	public Product(int vendorID, String vendorPartNumber, String name, double price, String unit, String phootoPath, String photoPath) {
		super();
		this.vendorID = vendorID;
		this.vendorPartNumber = vendorPartNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVendorID() {
		return vendorID;
	}

	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}


//	public Vendor getVendor() { //added this later bc it connects the Vendor class
//		return vendor;
//	}
//
//
//	public void setVendor(Vendor vendor) {
//		this.vendor = vendor;
//	}

	public String getVendorPartNumber() {
		return vendorPartNumber;
	}

	public void setVendorPartNumber(String vendorPartNumber) {
		this.vendorPartNumber = vendorPartNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhootoPath() {
		return photoPath;
	}

	public void setPhootoPath(String phootoPath) {
		this.photoPath = phootoPath;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code =\" + code + \",  vendorPartNumber="  + vendorPartNumber + ", name="
				+ name + ", price=" + price + ", unit=" + unit + ", photoPath=" + photoPath + "]"; //vendorID=" + vendor.getSummary()+ ",
	}
	
	

}
