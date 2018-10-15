
public class Methods {
	
	public static int getRandomNumber () {
		
		int Num=(int)(Math.random()*100+1);
		
		return Num;
	}
	
	public static void checkGuess(int Num, int Guess) {
		
		if (Guess<Num && Num-Guess>10) {
			System.out.println("Way too low");
		}
		else if (Guess<Num) {
			System.out.println("Too low");
		}
		else if (Guess>Num && Guess-Num>10) {
			System.out.println("Way too high");
		}
		else if (Guess>Num){
			System.out.println("Too high");
		}
	}

}
