import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
			System.out.println("Welcome to the the Guess a Number App!");

	        Scanner sc = new Scanner(System.in);
	        
	        int Num=Methods.getRandomNumber();
	        int counter =1;
	        String choice =  "y";
	        
	while (choice.equalsIgnoreCase("y")) {
	        	
	    while (true) {
	    	int Guess = Console.getInt("Enter a number: ", 1, 100);
	    	Methods.checkGuess(Num, Guess);
	        counter++;
	        if (Guess==Num && counter<=3) {
	        	System.out.println("You tried "+ counter + " times " + "you are a math wizard");
	        	break;
	        	}
	        else if (Guess==Num && counter>7){
	        	System.out.println("You tried "+ counter + " times " + "what took you so long?  You need to take math lessons");
	        	break;	
	        	}
	        else if (Guess==Num && counter>3){
		        System.out.println("You tried "+ counter + " times " + "not too bad");
		    	break;
			}
			System.out.println();
	       } 
	    	choice=Console.getString("Would you like to continue? (y/n): ", "y", "n");
	     }
	        sc.close();
		}
	}
