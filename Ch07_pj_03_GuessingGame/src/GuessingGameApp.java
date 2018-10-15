
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
