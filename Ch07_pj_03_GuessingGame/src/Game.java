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
