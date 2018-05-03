
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PersonManagerApp!");

		// start by getting user input, need to get strings c/e, first and last name via Console to print to the console for user to use	
		
		String choice=("Y");
		while (choice.equalsIgnoreCase("y")) {
		
			//this should be inside the while loop otherwise it will not come back to it
			String person= Console.getString("Create customer or employee? (c/e):  ", "c", "e"); 
			String first=Console.getString("First Name: "); 
			String last=Console.getString("LastName: ");
			
			if (person.equalsIgnoreCase ("c")) {
				String num=Console.getString("Customer Number:  ");
				Customer c = new Customer (first, last, num);//it will give u a chance to add the First, Last and Customer Number to Console
				System.out.println("You entered a new customer: \n " + c.toString());
				System.out.println("Number: " + c.getCustomerNumber());	
			}
			else if (person.equalsIgnoreCase ("e")) {
				String ssn=Console.getString("Employee ssn:  ");
				Employee e = new Employee (first, last, ssn); 
				System.out.println("You entered a new employee: \n " + e.toString());
				System.out.println("SSN: " + e.getSsn());
			}
			choice=Console.getString("Continue:? (y/n)  " , "y", "n"); //this is already validated in Console, use getString that takes 3 arguments
			System.out.println();
			System.out.println("Bye!");
		}
	}
}
