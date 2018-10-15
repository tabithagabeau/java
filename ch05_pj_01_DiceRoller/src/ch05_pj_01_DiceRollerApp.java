

public class ch05_pj_01_DiceRollerApp {

	
	public static void main(String[] args) {
	
		System.out.println("Welcome to the Dice Roller App!");
		
		String choice= "y";
		choice=Console.getString("Roll the dice? (y/n): ", "y", "n");
		
		while (choice.equalsIgnoreCase("y")) {		
			
			int Die1 = Methods.rollDie();
			int Die2 = Methods.rollDie();
			int total = Die1 + Die2;
			
			if(total==2 && Die1==1) {
				System.out.println("snake eyes!");
		}
			else if (total==12 && Die1==6) {
				System.out.println("box cars!");
		}
			else  {
				System.out.println("no special message!");
		}

			System.out.println("Die 1: " + Die1);
			System.out.println("Die 2: " + Die2);
			System.out.println("Total score: " + total);

			choice=Console.getString("Roll again? (y/n): ", "y", "n");		
			System.out.println();		
		}
		System.out.println("GoodBye for now: Thanks for Visiting Princess's App!");
	}
	
/*		
public static class Methods {
		
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
	} */
}