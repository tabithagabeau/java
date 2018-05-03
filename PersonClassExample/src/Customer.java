
public class Customer extends Person {
	
	private int number;
	
	public Customer() {
	}

	public Customer(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getFullName() {
		String fullName = getFirstName() + " " + getLastName();
		return fullName;
	}
	
	public int multiply(int integer1, int integer2) {
		int result = integer1*integer2;
		return result;
	}
	
	public static int staticMultiply(int integer1, int integer2) {
		int result = integer1*integer2;
		return result;
	}
}
