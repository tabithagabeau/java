
public class OddAndEvenCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Odd/Even Checker!");
		System.out.println();
		
		MyConsole myConsole = new MyConsole();
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
		int x= myConsole.getInt("Enter an integer:   ");
		
		    if (x % 2 == 0) {
		      System.out.println("The number " + x + " is even");
		      System.out.println();
		    }
		    if (x % 2 != 0) {
		      System.out.println("The number " + x + " is odd");
		      System.out.println();
		    }
		    choice=myConsole.getString("Continue? (y/n):     ", "y", "n");
		    System.out.println();
		}
		System.out.println("Goodbye, come again!");
	}	
}
