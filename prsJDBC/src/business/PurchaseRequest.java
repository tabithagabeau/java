package business;

import java.util.ArrayList;
import java.util.Date;

import com.sun.jmx.snmp.Timestamp;

public class PurchaseRequest {
	//@ID
	//@GeneratedValue(strategy=GeneratedType.IDENTITY)
	private int id;
	private int userID;
	private String description;
	private String justification;
	private Date dateNeeded;
	private String deliveryMode;
	private int statusID;
	//@JsonInclude(
	//Transcient
	//private String statusDesc; //?
	private double total;
	private Timestamp submittedDate;
	//private ArrayList<PRLI>prlis;
	
	public PurchaseRequest() {
		super();
	}
	public PurchaseRequest(int id, int userID, String description, String justification, Date dateNeeded,
			String deliveryMode, int statusID, double total, Timestamp submittedDate) {
		super();
		this.id = id;
		this.userID = userID;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.statusID = statusID;
		this.total = total;
		this.submittedDate = submittedDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getJustification() {
		return justification;
	}
	public void setJustification(String justification) {
		this.justification = justification;
	}
	public Date getDateNeeded() {
		return dateNeeded;
	}
	public void setDateNeeded(Date dateNeeded) {
		this.dateNeeded = dateNeeded;
	}
	public String getDeliveryMode() {
		return deliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}
	public int getStatusID() {
		return statusID;
	}
	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Timestamp getSubmittedDate() {
		return submittedDate;
	}
	public void setSubmittedDate(Timestamp submittedDate) {
		this.submittedDate = submittedDate;
	}

	
}

	
