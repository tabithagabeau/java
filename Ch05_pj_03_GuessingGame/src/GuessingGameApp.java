import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
			System.out.println("Welcome to the the Guess a Number App!");
			Scanner sc = new Scanner(System.in);
	        int Num = Methods.getRandomNumber();
	        int check = 0;
	        String choice = "y";
	        
	  while (choice.equalsIgnoreCase("y"))   {
		  
		  while (true) {
			  int Guess = Console.getInt("Enter a number between 1 and 100: ", 1, 100);
				  
			  Methods.checkGuess(Num, Guess);
			 // System.out.println("The random number is:" + Num); to check what is the random number
			  check++;  
			  if ((Num==Guess && check<=3 )) {
				 System.out.println("You tried: " + check+ " times  "+ "You re a mathematical wizard!");
				 break;
			  }
			  else if ((Num==Guess && check>7)) {
					 System.out.println("You tried: " + check+ " times  "+ "What took you so long? Take math class!");
					 break;
				  }
			  else if ((Num==Guess && check>3)) {
					 System.out.println("You tried: " + check+ " times  "+ "you have got some potentials!");
					 break;
				  }  
		  }
		  choice= Console.getString("Try again?: (y/n): ", "y", "n");
		  sc.close();
		  System.out.println("Bye!");
	  }
	  }

 private static int getInt (Scanner sc, String prompt)	{
	 int guessNumber=0;
	 boolean isValid = false;
	 while (!isValid) {
		 System.out.println(prompt);
		 if (sc.hasNextInt()) {
			 guessNumber=sc.nextInt();
			 isValid=true;
			 
		 }
		 else {
			 System.out.println("Error - please enter a valid intiger");
			 sc.nextLine();
		 }
	 }
	 return guessNumber;
 };

 
}
 
