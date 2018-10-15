


public class Methods {
	
	public static int rollDie() {
		int Die = (int) (Math.random()*6)+1;
		return Die;
	}
	
	public static int addTheDicesScore(int Die1, int Die2) {
		Die1= (int) (Math.random()*6)+1;
		Die2= (int) (Math.random()*6)+1;
		int total = Die1 + Die2;
			return total;
				
	}	
	
}