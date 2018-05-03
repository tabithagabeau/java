import java.text.NumberFormat;
import java.util.Scanner;

public class PowerApp {

	public static void main(String[] args) {
		 System.out.println("Welcome to the Square and cubes table\n");

			// Create a scanner object
			Scanner sc = new Scanner(System.in);
			
	 //perform conversions until choice isn't equal to "y" or "Y"	
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				
	            // get the input from the user
	            System.out.print("Enter an intiger:   ");
	            int num = sc.nextInt();
	            System.out.println();
	            					
				//add a code that calculate Square and Cubes:
			
	            // initialize the table variable
	            String table = "";
	            
	            // create header row and add it to the table
	            table+="Number\tSquared\tCubed\n";
	            table+="======\t======\t======\n";
	            
	            //Create raws to add to the the table
	            for (int i=1; i<=num; i++) {
	            	int square = i*i;
	            	int cube = i*i*i;
	                // add row to the table
	                table += i + "\t" + square + "\t" + cube + "\n" ;
	            }
	            System.out.println();
	            System.out.println(table);

	            // see if the user wants to continue
	            System.out.print("Continue? (y/n): ");
	            choice = sc.next();
	            System.out.println();
	        }
	        System.out.println("Bye!");
	    }

	}
