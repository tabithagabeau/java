import java.util.Scanner;

public class Ch02_pj_GradeConverterPractice {
	
	public static void main (String[]arg) {
	System.out.println("Welcome to my cool app");
		
		Scanner sc= new Scanner(System.in);
		String letterGrade = "";
		String choice ="y";
	
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter numeric grade:" );
			int numGrade = sc.nextInt();

			if (numGrade<60) {
				letterGrade="F";
			}
			else if (numGrade<70) {
				letterGrade="D";
			}
			else if (numGrade<80) {
				letterGrade="C";
			}	
			else if (numGrade<90) {
				letterGrade="B";
			}
			else if  (numGrade<=100) {
				letterGrade="A";
			}
			System.out.println("Your grade is:" + letterGrade);
			System.out.println("continue: y/n");
		choice=sc.next();	
		}
	sc.close();	
	}
}
