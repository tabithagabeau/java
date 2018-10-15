
public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller app");
		System.out.println();
		Dice dice = new Dice();
		
		String choice= "y";
		
		while (choice.equalsIgnoreCase("y")) {	
			
			dice.roll();
			dice.printRoll();
		
			choice=Console.getString("Roll again? (y/n): ", "y", "n");		
			System.out.println();
		}
		System.out.println("GoodBye for now: Thanks for Visiting Princess's App!");
	}
}

