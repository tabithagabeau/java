
public class Methods {

	public  static int getRandom () {
		int num = (int) (Math.random()*100+1);
		//System.out.println(num); this will tell what the real number is
		
		//to create a random number you use Math.rand(), let say if you want int between 1-25, multipy by 26 (rounds down)
		return num;

	}

	public static void checkGuess(int guess, int num ) {

		if (num > guess && num-guess>10) {
			System.out.println("Way too low!");
		}
		else  if (num > guess) {
			System.out.println("To low!");
		}
		else if ( num < guess && guess-num>10) {
			System.out.println("Way to high!");
		}
		else if ( num < guess) //not necessary bc there is no any choice, if you do, use "else if" instead "else"
		{
			System.out.println("Too high!");
		}
	}
}

