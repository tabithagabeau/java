<<<<<<< HEAD

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
=======
import java.util.Scanner;

public class Game {
	private int num;
	private int guess;
	private int count;
	
	public void getRandomNum(){
		num= (int)(Math.random()*100)+1;
		count=0;
	}

	public void guessNumber(int guess) {
		this.guess=guess;	
		count++;
	}
	
	public void displayWelcomeMessage() {
		System.out.println(" Welcome to the Guess the Number Game");
		System.out.println(" ++++++++++++++++++++++++++++++++++++");
		System.out.println();
	}
	
	public void tryToGuessNumberDisplayMessage() {
		System.out.println(" I am thinking of a number from 1 to 100");
		System.out.println(" Try to guess it.");
		System.out.println();
	}

	public boolean isRightGuess() {
		return guess==num;
	}
	
	public void displaySuccessGuessMessage() {
		System.out.println(" You got it in " + count + " tries");

		if (count <=3) {	
			System.out.println(" Great work! You are a mathematical wizard.");
			System.out.println();
		}
		else if (count >3 && count <=7)  {
			System.out.println(" Not to bad! you have got some potentials.");	
		}
		else {
			System.out.println(" What took you so long! Take math lessons");
			System.out.println();
		}
	}
		public void displayUnsuccessGuessMessage() {
			
		if (guess>num) {
				if (guess-num >10) {
					System.out.println(" Way too high! Guess again.");
					System.out.println();
				}
				else {
					System.out.println(" Too high! Guess again.");
					System.out.println();
				}
			}
		else  {
				if (num-guess >10) {
				System.out.println(" Way too low! Guess again.");
			}
				else  {
					System.out.println(" Too low! Guess again.");
					System.out.println();
			}
		}
	}
}
>>>>>>> 20a755ef4778dc3a6796c089238ec3a41b52f9f8
