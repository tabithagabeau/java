import java.util.ArrayList;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {	
	
	//biz logic - the while loop (choice "Y") and for Loop nested in the while loop, the return and print
	String choice = "y";
	while (choice.equalsIgnoreCase("y")) {
		//User Input, allow the user to enter an integer from Console 
		int number = Console.getInt("Please enter an intiger between 1 and 5000:  ", 0, 5001 );
		
		//Get a list of factors 1 to 5000 using array list
	ArrayList <Integer> factors = new ArrayList <> ();
		for (int i=1; i<=number/2; i++) {
		int remainder= number%i; if (remainder==0) {
			factors.add(i);
			} 
		}
		//let now display message
		if (factors.size()==2) {
			 System.out.println(number + " is a Prime Number");
		}	
		else {
			System.out.println(number + " is NOT a Prime Number");
		 	System.out.println("It has  "+ factors.size() + "  factors");
		 	for (int factor: factors) {
		 		System.out.println(factor + "");
		 	}
		 	System.out.println();
		}
		choice =Console.getString("Try Again:? (y/n): ");
		
		System.out.println();
			} // end of while loop

		System.out.println("Bye");
		}
}



