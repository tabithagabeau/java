
public class AnimalCounterApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("Welcome to Animal Counter App!");
		System.out.println();
		countAllegators();
		countSheep();
		System.out.println();
		System.out.println("Good bye!");
		
	}
	
	//use interface Countable to count the maximum number of times you wishes
	public static void count (Countable c, int maxCount) {	
		//use all of Interface Countable 4-methods 
		c.resetCount();
		while (c.getCount()<= maxCount) {
			System.out.println (c.getCountString());
		c.incrementCount();
		}
	}
	
		public static void countAllegators() {
			System.out.println("Counting Allegators ....\n");
			Alligator alligator = new Alligator();
			alligator.getCountString();
			count(alligator, 3); //call the static count method above
			
		}
		
		public static void countSheep() throws CloneNotSupportedException {
			System.out.println("\n Counting Sheep....\n");
			Sheep sheep = new Sheep("Blackie");
			sheep.setName("Blackie");
			sheep.getCountString();
			count(sheep, 2); 
			System.out.println();
			
			//clone sheep p317
			try {
			Sheep dolly = (Sheep) sheep.clone();
			dolly.setName("Dolly");
			dolly.getCountString();
			count (dolly, 3); 
			}
			catch (CloneNotSupportedException e) {
				System.out.println("unable to clone: " + e.getMessage());
			}
			System.out.println();
			count(sheep, 1); 
		}
		
		

}
