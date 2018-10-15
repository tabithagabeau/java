
public class Dice {
	
	private Die die1;
	private Die die2;
	
	public Dice() {
	die1 = new Die();
	die2 = new Die();
	}
	public int getDie1Value() {
		return die1.getValue();
	}
	public int getDie2Value() {
		return die2.getValue();
	}
	public int getSum() {
		int sum = getDie1Value() + getDie2Value();
		return sum;	
	}
	public void roll() {
		Console.getString("Roll the dice? (y/n): ", "y", "n");
		System.out.println();
		die1.roll();
		die2.roll();
	}	
	 public void printRoll() {
		 int die1=getDie1Value();
		 int die2=getDie2Value();
		 int total= getSum();
		 
		 System.out.println("Die 1: " + die1);
		 System.out.println("Die 2: " + die2);
		System.out.println("Total: " + total);
		
		if (total==7) {
			 System.out.println("Craps!");
		 }
		 else if (die1==6 && die2==6) {
			 System.out.println("Box Cars");
		 }
		 else if (die1==1 && die2==1) {
			 System.out.println("Snake eyes");
		 } 
	 }
	
}
