import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
			System.out.println("Welcome to the the Guess a Number App!");

	        Scanner sc = new Scanner(System.in);
	        
	        int number = generateRandomNumber();
	        
	        
	        boolean correctGuess = false;
	        while (!correctGuess) {
	        	int  guess=getIntWithinRange();
	        	int diff = guess -number;
	        	if (diff <+-10) {
	        		System.out.println("Way too low");
	        	}
	        	else if (diff >+-10) {
	        		System.out.println("Way too high");
	        	}
	        		
	        	}
	        		
	        }
	        
	        sc.close();
	        System.out.println("Bye!");

	}
private static int generateRandomNumber() {
	System.out.println("I am thinking of a number between 1 and 100.\nTry to guess it.");
	int random = (int)(Math.random()*100)+1;
	return random;
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

 private static int getIntWithinRange (Scanner sc, String prompt)	{
	 int guessNumber=0;
	 boolean isValid = false;
	 while (!isValid) {
		 guessNumber = gtInt(sc, prompt);
		 
		 if (guessNumber >= min) {
			 if (isValid && guessNumber <= max);
			 isValid = true;
			 else {
				 System.out.println("Error: number must be less than..." + int max);
			 }
		 }
		 
		
//		 if (sc.hasNextInt()) {
//			 guessNumber=sc.nextInt();
//			 isValid=true;
//			 
//		 }
//		 else {
//			 System.out.println("Error - please enter a valid intiger");
//			 sc.nextLine();
//		 }
 
}
 }
