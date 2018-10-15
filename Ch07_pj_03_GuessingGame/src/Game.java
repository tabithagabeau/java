
public class Game {
	
	private int randomNum;
	private int guessNum;
	private int count;
	
	public void getRandomNum() {
		randomNum = (int) (Math.random()*100)+1;
		count=0;
	}
	public void guessTheNumber() {
		guessNum=Console.getInt("Enter a number: ", 1, 100);
		count++;
	}
	public void displayWelcomeMessage() {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();
	}
	public void inviteUserToGuessTheNumber() {
		System.out.println("I am thinking of a number from 1 to 100");
		System.out.println("Try to guess it.");
		System.out.println();
	}

	public boolean isCorrectGuess() {
		return randomNum==guessNum;
	}
	public void displayCorrectGuessMessage() {
		System.out.println("Yout got it in " + count  + "  tries");
		
		if (count<=3) {
			System.out.println("Great work, you are a mathematical wizard!");
		}
		else if (count<=7) {
			System.out.println("Not to bad, you have got some potentials");
		}
		
		else {
			System.out.println("What took you so long, you need to take Math lessons");
		}
			System.out.println();
	}
	public void displayUnsuccessulGuessMessage() {
		
		if (guessNum>randomNum) {
			if (guessNum-randomNum<=10) {
			System.out.println("Too high, guess again");
			}
			else {
			System.out.println("Way too high, guess again");
			}
		}
		else  {
			if(randomNum-guessNum<=10) {
				System.out.println("Too low, guess again");
			}
			else {
			System.out.println("Way too low, guess again");
		}
		}
		System.out.println();
	}
}
