package business;

public class Product {

	private int id;
	private int vendorID; 
	private Vendor vendor;// add instance of vendor to connect to Vendor ID of Vendor class, no need to add it to Constructor, add gett/sett
	private String vendorPartNumber;
	private String name;
	private double price;
	private String unit;
	private String phootoPath;
	
	public Product() {
		//empty constructor
	}

	

	public Product(int id, int vendorID, String vendorPartNumber, String name, double price, String unit,
			String phootoPath) {
		super();
		this.id = id;
		this.vendorID = vendorID;
		this.vendorPartNumber = vendorPartNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.phootoPath = phootoPath;
	}

	public Product(int vendorID, String vendorPartNumber, String name, double price, String unit, String phootoPath) {
		super();
		this.vendorID = vendorID;
		this.vendorPartNumber = vendorPartNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.phootoPath = phootoPath;
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


	public Vendor getVendor() { //added this later bc it connects the Vendor class
		return vendor;
	}


	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

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
		return phootoPath;
	}

	public void setPhootoPath(String phootoPath) {
		this.phootoPath = phootoPath;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code =\" + code + \", vendorID=" + vendor.getSummary() + ", vendorPartNumber=" + vendorPartNumber + ", name="
				+ name + ", price=" + price + ", unit=" + unit + ", phootoPath=" + phootoPath + "]";
	}
	
	
	
}
