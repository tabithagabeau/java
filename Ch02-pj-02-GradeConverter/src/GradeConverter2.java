import java.util.Scanner;

public class GradeConverter2 {

	public static void main(String[] args) {
		System.out.println("Welcome to Grade Converter App2");
		Scanner sc = new Scanner(System.in);
		
		//declare your variables;
		String lGrade=" "; 
		String choice = "y";
		
		 while (choice.equalsIgnoreCase("y")) {
	System.out.println("Enter Numeric Grade:");
	int nGrade=sc.nextInt(); //enter numeric grade from user
	
		if (nGrade<60) {
			lGrade="F";
		}
		else if (nGrade<68) {
			lGrade ="D";
		}
		else if (nGrade<68) {
			lGrade ="D";
		}else if (nGrade<80) {
			lGrade ="C";
		}else if (nGrade<88) {
			lGrade ="B";
		}
		else if (nGrade<=100) {
			lGrade ="A";
		}
	System.out.println("Your Letter Grade is: " + lGrade);
	System.out.println("Continue: y/n");	
	choice=sc.next();
	}
	 System.out.println("Thank you for checking out our App!");
		sc.close();
	}
}
