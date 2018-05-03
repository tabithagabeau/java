import java.util.Scanner;

public class CommonDivisorCalculator {

	public static void main(String[] args) {
		 System.out.println("Welcome to the Greeatest Divisor Finder\n");

			// Create a scanner object
			Scanner sc = new Scanner(System.in);
			
	 //perform conversions until choice isn't equal to "y" or "Y"	
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				
	            // get the input from the user
	            System.out.print("Enter x :   ");
	            int x = sc.nextInt(); //assigning x to an int
	            System.out.println("Enter y:   ");
	            int y = sc.nextInt(); //assigning y to an int 
	            					
			//add a code that finds the greatest common division:
	          while (x!=0) {
	        	  // add another loop inside thi loop per instructions 
	          while (y>=x) {
	        	  y-=x;
	          }	
	          //must swap so that it will always work even if x>y so, you assign y to another int z to allow swapping. do this outside of the while loop
	          int z=y;
	          y=x;
	          x=z;
	          }
	            
//	         // Other alternative way to do this  - use short cut CTL / to comment a block out
//	          /* while (x!=y) {
//	          if (y>x) {
//	        	  y-=x;
//	          }
//	          else {x-=y;} } */
	            
	            System.out.println("Greatest common divior is "+ y );

	            // see if the user wants to continue
	            System.out.print("Continue? (y/n): ");
	            choice = sc.next();
	            System.out.println();
	        }
			
			sc.close(); // this call on methods automatically, dont have to do it manually
	        System.out.println("Bye!");
	    }

	}
