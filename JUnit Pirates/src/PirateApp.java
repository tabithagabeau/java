import java.util.ArrayList;

public class PirateApp {

	private static ArrayList<Pirate> pirates = new ArrayList<>();
	
	public static void main(String[] args) {

		Pirate p1 = new Pirate("Jack Black");
		pirates.add(p1);
		System.out.println(p1.getName()+" added. # of pirates = "+Pirate.getNumPirates());
		Pirate p2 = new Pirate("Blackbeard");
		pirates.add(p2);
		System.out.println(p2.getName()+" added. # of pirates = "+Pirate.getNumPirates());
		Pirate p3 = new Pirate("Stubby",3);
		pirates.add(p3);
		System.out.println(p3.getName()+" added. # of pirates = "+Pirate.getNumPirates());
		System.out.println();
		
		printPirateStats();
		
		System.out.println("Pirate fight!!!");
		p1.loseALimb();
		//p2 loses limbs
		for (int i=0;i<5;i++)
			p2.loseALimb();
		System.out.println();
		System.out.println("Tough fight... who's left?");
		for (Pirate p:pirates) {
			System.out.println("Is "+p.getName() +" dead? "+p.isDead());
		}
		System.out.println();
		
		printPirateStats();
		
		System.out.println("Bye!");
	}

	private static void printPirateStats() {
		System.out.println("# of Pirates = "+Pirate.getNumPirates());
		System.out.println("# of limbs lost = "+Pirate.getTotalLimbsLost());
		System.out.println("Pirates Summary:");
		System.out.println("================");
		for (Pirate p:pirates) {
			System.out.println(p);
		}
		System.out.println();
	}
}
