
public class SwitchBreakStament {

	public static void main(String[] args) {
		
		String moonPhase = "full";

		switch (moonPhase ) {
		  case "full":
		  System.out.println("Howl!");
		    break;
		  case "ostly full":
			  System.out.println("Arms and legs are getting hairier");
		    break;
		  case "mostly new":
			  System.out.println("Back on two feet");
		    break;
		  default:
			  System.out.println("Invalid moon phase");
		    break;
		}

	}

}
