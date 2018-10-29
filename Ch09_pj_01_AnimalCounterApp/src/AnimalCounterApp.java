
public class AnimalCounterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Animal count App!");
		System.out.print("\n");
		
		countAllegators();
		countSheep();
		
		System.out.print("\n");
		System.out.println("Good job, Bye!");
	}
	
	public static void countAllegators() {
		System.out.println("Counting Allegators ....\n");
		
		Allegator allegator = new Allegator ();
		// use the count method from the class Animal to count alligator object 3 times
		count (allegator, 3);
	}
		
	private static void countSheep() {
		System.out.println("\nCounting Sheeps ....\n");
		Sheep blackie = new Sheep ("blackie");
		blackie.setName("Blackie");
		count (blackie, 2);	
		System.out.print("\n");
	
		//clone the sheep
		Sheep dolly = blackie;
		try {
			dolly = (Sheep)blackie.clone();
			dolly.setName("Dolly");
			count(dolly, 3);
		}
		catch (CloneNotSupportedException e) {
		System.out.println(("Unable to clone: " + e.getMessage()));
		}

		System.out.print("\n");	
		count (blackie, 1);	
	}	
	
	private static void count(Countable c, int maxCount) {
		c.resetCount();
		while (c.getCount() <=maxCount) {
			System.out.println(c.getCountString());
			c.incrementCount();
		}
	}
}
