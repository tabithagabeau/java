import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class GradeConverter {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Grade Converter App!");
		
		Scanner sc= new Scanner(System.in);
		
		String letterGrade =" "; //declare your output letter grade variable meaning initialize it to a string
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			//prompt user to enter data
			System.out.println("Enter Numeric Grade: ");
			int numGrade = sc.nextInt(); //use sc to have user enter a number
			
			if (numGrade <=60) {
				letterGrade = "F";	
			}
			else if (numGrade <=67) {
				letterGrade = "D";	
			}
			else if (numGrade <=79) {
				letterGrade = "C";	
			}
		else if (numGrade <=87) {
			letterGrade = "B";	
			
			}
		else if (numGrade <=100) {
				letterGrade = "A";	
			}
		
			System.out.println("Letter Grade  "+ letterGrade + "\n");		
			
			System.out.println("continue: y/n");
			choice = sc.next();
		}
		
	System.out.println("Bye!");	
	sc.close();
		
	
	}

}
