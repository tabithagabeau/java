
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
