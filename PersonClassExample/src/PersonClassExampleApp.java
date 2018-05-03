
public class PersonClassExampleApp {

	public static void main(String[] args) {
		
		
		Customer c = new Customer();
		c.setFirstName("Matthew");
		c.setLastName("Burkard");
		
		Customer c2 = new Customer();
		c2.setFirstName("Brian");
		c2.setLastName("Burkard");
		
		
		System.out.println(c.toString());

//		System.out.println(c.getFullName());
//		String name = c.getFullName();
//		Customer c = new Customer(5);
//		int result = c.multiply(10, 5);
//		int result = Customer.staticMultiply(10, 5);
//		System.out.println(result);
//		Customer c = new Customer();
//		c.setNumber(5);
	}
}

