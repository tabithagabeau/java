
public class Customer extends Person {
	
	private String customerNumber;

	public Customer(String firstName, String lastName, String customerNumber) {
		super(firstName, lastName);
		this.customerNumber = customerNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}


}
