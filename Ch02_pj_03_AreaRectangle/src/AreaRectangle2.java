import java.util.Scanner;

public class AreaRectangle2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area of a Rectangle App!");
		System.out.println();
		
		Scanner sc= new Scanner (System.in);
		double area =0;
		double perimeter = 0;;
		String choice = "y";

	while (choice.equalsIgnoreCase("y")) {
		//Get width and length from user
		System.out.println("Enter Width:");
		int w=sc.nextInt();
		System.out.println("Enter Length:");
		int l=sc.nextInt();
		
		//Calculate area and perimeter
		area = w*l;
		System.out.println("The area of the rectangle is: " + area);
		perimeter= (w+l)*2;
		System.out.println("The perimeter of the rectangle is: " + perimeter);
		
		System.out.println("contininue? (y/n): ");
		choice=sc.next();
		}
	sc.close();
	}
}
	
