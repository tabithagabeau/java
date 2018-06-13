import java.util.Scanner;


public class StudentRegistration {

		public static void main(String[] args) {
			System.out.println("Welcome to Student Registration App!");
			System.out.println();
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter First Name: ");
			String fName=sc.next();
			
			System.out.println("Enter Last Name: ");
			String lName=sc.next();
			
			System.out.println("Enter Year of Birth: ");
			int bYear=sc.nextInt();
			System.out.println();
			
			System.out.println("Welcome: " + fName+ " "+ lName +" "+"!" +"\n");
			System.out.println("Your temporary password is: " +fName+"*"+bYear);
			System.out.println();
			
			sc.close();
	}

}
