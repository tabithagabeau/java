import java.util.Scanner;

public class AreaRectangleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Area Rectangle App!");
		
		String choice = "y";
		Scanner sc= new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			// tell what the user will do or enter (declaring variable and assigning variables)
			System.out.println("print Lenght");
			double Length= sc.nextDouble();
			
			System.out.println("print Width");
			double Width = sc.nextDouble();
			
			//Do calculations
			double Area= Length * Width;
			double Perimeter = (2*Length)+(2*Width);
			
			//print the calculations to the console
			//System.out.println("Area:   " + Area);
			//System.out.println("Perimeter:    " + Perimeter);
			
			//print the calculations to the console alternative to above
			System.out.println("Area:   " + Area + "\n "+ "Perimeter:    " + Perimeter);
			
			//add continue statement
			System.out.println("continue?  (y/n): " ); // this will reference the choice y  declared at the beginning
			choice = sc.next();
				
		}
		sc.close();
		System.out.println("Bye!");
		
	}

}
