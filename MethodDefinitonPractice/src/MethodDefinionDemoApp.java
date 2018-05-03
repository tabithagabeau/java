
public class MethodDefinionDemoApp {
	public static void main(String[] args) {
		System.out.println("Welcome to Method Definion Demo App!");
		
		Person Breck = new Person("Breck", 'm', 8, 5); //that is how we connect to method Person. Don't need anything else
		
		System.out.println(Breck);
		
		//try and catch is to add exception handling if not only keep what you have in try
		try {
		Breck.getHairCut(3); //first time 5 inches
		Breck.getHairCut(2); // second time take off 2 inches
		Breck.getHairCut(0);
		
	}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		//System.out.println(Breck.print); to print the interface printable, you have to call that method
		System.out.println(Breck); // this print second line of what we have left
		System.out.println("bye!");
}
}