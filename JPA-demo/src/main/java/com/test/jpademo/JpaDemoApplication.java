package com.test.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.jpademo.business.Product;
import com.test.jpademo.business.ProductDB;
import com.test.jpademo.business.PurchaseRequest;
import com.test.jpademo.business.PurchaseRequestDB;
import com.test.jpademo.business.PurchaseRequestLineItem;
import com.test.jpademo.business.PurchaseRequestLineItemDB;
import com.test.jpademo.business.User;
import com.test.jpademo.business.UserDB;
import com.test.jpademo.business.Vendor;
import com.test.jpademo.business.VendorDB;
import com.test.jpademo.db.DBUtil;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
		System.out.println("Hello");
	try {
		User u = UserDB.getUserById(1);
		System.out.println("user retrieved = "+u);
		
		Product p = ProductDB.getProductById(1);
		System.out.println("product retrieved = "+p);
		
		Vendor v = VendorDB.getVendorById(1);
		System.out.println("vendor retrieved = "+ v);
		
		PurchaseRequest pr = PurchaseRequestDB.getPurchaseRequestById(1);
		System.out.println("purchaseRequest retrieved = "+ pr);
		
		PurchaseRequestLineItem prli = PurchaseRequestLineItemDB.getPurchaseRequestLineItemById(1);
		System.out.println("purchaseRequestLineItem retrieved = "+ prli);
	}
	catch (Exception e) {
		System.err.println("Exception encountered!!  Details:  ");
		e.printStackTrace();
	}
	
		DBUtil.closeEMF();
		System.out.println("Bye");
	}
}
