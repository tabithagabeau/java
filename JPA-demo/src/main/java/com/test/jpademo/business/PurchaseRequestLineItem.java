package com.test.jpademo.business;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseRequestLineItem implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int purchaseRequestId;
	private int productID;
	private int quantity;
	
	public PurchaseRequestLineItem(int id, int purchaseRequestId, int productID, int quantity) {
		super();
		this.id = id;
		this.purchaseRequestId = purchaseRequestId;
		this.productID = productID;
		this.quantity = quantity;
	}

	public PurchaseRequestLineItem() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPurchaseRequestId() {
		return purchaseRequestId;
	}

	public void setPurchaseRequestId(int purchaseRequestId) {
		this.purchaseRequestId = purchaseRequestId;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
