<<<<<<< HEAD

public class GuessingGameApp {

	public static void main(String[] args) {
		Game game = new Game();
		game.displayWelcomeMessage();
	
		String choice= "y";
		
		while (choice.equalsIgnoreCase("y")) {	
		game.inviteUserToGuessTheNumber();
		game.getRandomNum();
		
		while(!game.isCorrectGuess()) {
			game.guessTheNumber();
			
				if(game.isCorrectGuess()) {
					game.displayCorrectGuessMessage();	
				}
				else {
					game.displayUnsuccessulGuessMessage();
				}
		}
			choice=Console.getString("Try again? (y/n): ", "y", "n");		
			System.out.println();		
		}
		choice=Console.getString("Try again? (y/n): ", "y", "n");
		System.out.println("GoodBye for now: Thanks for Visiting Princess's App!");
	}

}
=======

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Princess app!");
		
		Game game = new Game ();
		game.displayWelcomeMessage();
		
		String choice="y";	
		while(choice.equalsIgnoreCase("y")) {
			game.tryToGuessNumberDisplayMessage();
			game.getRandomNum();
			
		while (!game.isRightGuess()) {
			int guess = Console.getInt("Enter number: ", 1, 100);
			game.guessNumber(guess);
			
			if (game.isRightGuess()) {
			game.displaySuccessGuessMessage();
			}
			else {
				game.displayUnsuccessGuessMessage();
				}	
			}
		choice=Console.getString("Try again? (y/n) ", "y", "n");

		}	
		System.out.println("Goodbye, come back again!");
		System.out.println();
	}
}
>>>>>>> 20a755ef4778dc3a6796c089238ec3a41b52f9f8
