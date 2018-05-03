package ui;

import java.util.HashMap;
import java.util.List;

import business.Product;
import business.ProductDB;
import business.Vendor;
import business.VendorDB;
import util.Console;

public class PRSConsole {
	
	//let use HashMap to print less as commented below, thi will prompt you to import HashMap
	private static HashMap <Integer, Vendor> vendorMap = new HashMap<>();

	public static void main(String[] args) { //see chap 21.2 ProductManagerApp
		System.out.println("Welcome to the PRS Console App!");
		
		String choice = "";
		while (!choice.equalsIgnoreCase("exit")) {
			choice = Console.getString(displayMenuOptions());
			if (choice.equalsIgnoreCase("list")) {
				listAllVendors();
			}
			else if (choice.equalsIgnoreCase("get")) {
				int id = Console.getInt("Enter id to retrieve:  ");
				getVendor(id);
			}
			else if (choice.equalsIgnoreCase("add")) {
				addVendor();
			}
			else if (choice.equalsIgnoreCase("remove")) {
				removeVendor();
			}
			else if (choice.equalsIgnoreCase("product")) {
				listAllProducts(); //to add products
			}
		}
		
		System.out.println("Bye");
	}
	
	private static void addProduct() {
		// TODO Auto-generated method stub
		
	}

	private static String displayMenuOptions() {
		String msg = "Menu Options\n" +
					 "list   - list all Vendors\n" +
					 "get    - get a Vendor by ID\n" +
					 "add    - add a Vendor\n" +
					 "remove - delete a vendor\n" +
					 "product	 - list all Products\n" + //added products now
					 "exit   - exit the app\n";
		return msg; // same as Sysout each one by one as in example chap 21.2
	}

	private static void listAllVendors() { //this biz logic should be in ProductDB class,
		// Call the database to get list of all vendors
		List<Vendor> vendors = VendorDB.list();
		
		for (Vendor v : vendors) {
			System.out.println(v);
		}
	}
	private static void getVendor(int id) {
		// Call the database to get a vendor
		Vendor vendor = VendorDB.get(id);
		
		// Display vendor to the screen
		System.out.println(vendor);
	}
	
	private static void addVendor() {
		//int id = Console.getInt("Enter Vendor ID:   ");
		String code = Console.getString("Enter Vendor Code:  ");
		String name = Console.getString("Enter Vendor Name:  ");
		String address = Console.getString("Enter Vendor Address:  ");
		String city = Console.getString("Enter Vendor City:  ");
		String state = Console.getString("Enter Vendor State:  ");
		String zip = Console.getString("Enter Vendor Zip:  ");
		String phone = Console.getString("Enter Vendor Phone:  ");
		String email = Console.getString("Enter Vendor Email:  ");
		boolean preapproved = false;
		Vendor v = new Vendor(code, name, address, city, state, zip, phone, email, preapproved);
		VendorDB.add(v);
	}
	
	private static void removeVendor() {
		//prompt user for id to delete
		int id = Console.getInt("Enter id to delete:  ");
		//get instance for that id
		Vendor v = VendorDB.get(id);
		//delete that instance from the db
		if (VendorDB.remove(v))
			System.out.println("Success:  vendor ("+v.getCode()+") successfully deleted.");
		else
			System.out.println("Error deleting vendor!");
	}
	//this relate to Product class list method
	private static void listAllProducts() {
		// Call the database to get list of all vendors
		List<Product> products = ProductDB.list();
		
		//build a map of vendors - when you populate a cash of data, where do you put it? 
		
		// Display all products to the screen
		for (Product p : products) {
			//for each product get the related vendor info
			//in reality this logic should exist elsewhere, maybe in the ProductDB class
			// Display all vendors to the screen
			int vID = p.getVendorID();
			//Vendor v = VendorDB.get(vID); //now use HashMap
			vendorMap.put(vID, VendorDB.get(vID));
			Vendor v = vendorMap.get(vID);
			p.setVendor(v);
			//System.out.println(v);
			System.out.println(p); //this will print all Vendors (too many), product Staples(many), use a Hashmap to inquire only one
		}
	
		}
	
	//create another method for HashMap - populate the Vendor Map instance variable for use later
	private void populateVendorMap() {
		List<Vendor> vendors = VendorDB.list();
		
	for (Vendor v : vendors) {
			vendorMap.put(v.getId(), v); //only get a value for one key
		}
	}

}