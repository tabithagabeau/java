
public class OddOrEvenCheckerApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the Odd or Even Checker App");
			
		MyConsole console = new MyConsole();
		
	String	choice ="y";
	while (choice.equalsIgnoreCase("y")){

		int num=console.getInt("Enter an integer:   ");
		if (num%2==0) {
			System.out.println("The number: " + num +  " " + "is even"  + "\n");
		}
		else {
			System.out.println("The number: " + num +  " " + "is odd"  + "\n");
		}
		choice=console.getString("Continue? y/n:    ");
		System.out.println("Bye!");
		}	
	}
}
