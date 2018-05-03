//import java.util.Scanner;

public class GuessingNumberAPP {

	//Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to the GuessingNumber App!");
		int counter = 1;
		int num =Methods.getRandom();

		String choice="y"; //start your while loop	
		while (choice.equalsIgnoreCase("y")) {

			while(true) //loops infinitely until we tell it to break 
			{
				int guess=Console.getInt("Enter a number:" , 1, 100); // when you get guess=console.get it prompt you to (int, Promopt, Min, Max
				Methods.checkGuess(guess, num);
				counter++; //will tell you how many trials

				if (guess ==num && counter >7) {
					System.out.println("Take Math classes");
					break; //if you don't break it will not go to the next one bc you used while true
				} else if (guess ==num && counter >3) {
					System.out.println("Not too bad, Youhave got some potential");
					break;
				} else if (guess== num && counter <=3) {
					System.out.println("Great work, You are a math wizard");
					break;
				}
				System.out.println();
			}
			choice =Console.getString("Try Again:? (y/n): ", "y", "n");
		}
	}
}

