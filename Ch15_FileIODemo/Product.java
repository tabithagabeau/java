
public class Product {
	// The instance variables
	private String code;
	private String description;
	private double price;
	private static int numberOfObjects = 0;
	
	public Product() {
		code = "";
		description = "";
		price = 0.0;
		incrementNumObjects();
	}

	public Product(String inCode, String inDesc, double inPrice) {
		code = inCode;
		description = inDesc;
		price = inPrice;
		incrementNumObjects();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public static void setNumberOfObjects(int numberOfObjects) {
		Product.numberOfObjects = numberOfObjects;
	}
	
	public static void incrementNumObjects() {
		numberOfObjects++;
	}

	public String getProductSummary() {
		String msg = getCode()+ " | " + getDescription()+ " | " + getPrice() + " | " 
				+ getNumberOfObjects();
		return msg;
	}
}
