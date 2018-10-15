
public class Dice {
	private Die die1;
	private Die die2;
	
	//must instantiate because these are 'not' static methods where one can directly call from the class
	public Dice() {
		die1= new Die();
		die2= new Die();
	}

	public int getDie1Value() {
		return die1.getValue();
	}
	
	public int getDie2Value() {
		return die2.getValue();
	}
	
	public int getSum() {	
		int total = die1.getValue() + die2.getValue();
		return total;	
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}
	
	public  void printRoll() {
		int total = getSum();
		
		System.out.println();
		System.out.println("roll die1: " + die1.getValue());
		System.out.println("roll die2: " + die2.getValue());
		System.out.println("Total: " + total);
		
		switch (total) { //syntax error if small "s" for switch is not used
			case 2:
				System.out.println("snake eyes!");
				break;
			case 7:
				System.out.println("craps!");
				break;	
			case 12:
				System.out.println("box cars!");
				break;
		}
		System.out.println();

	}
}
