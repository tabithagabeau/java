
public class DiceRollerApp {

	public static void main(String[] args) {
		
	 System.out.println("Welcome to the Dice Roller!");
	 System.out.println();
	
	 Dice die = new Dice(); //must instantiate or else set Dice Methods to static to allow direct call on methods;
	 
	 Console.getString("Roll the dice? (y/n)", "y", "n");
	 
	 String choice ="y";
	 while (choice.equalsIgnoreCase("y")) {
		 die.roll();
		 die.printRoll();

		choice=Console.getString("Roll again? (y/n)", "y", "n");
	 }
	 System.out.println("Thank you for visiting Princess's app! Come back soon for more.");
	}
}
