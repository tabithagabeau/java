import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        
        // 2-Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Get input from the the user
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        // Get and validate user's date of birth (3- parse the local time page 443)       
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString); 
        
        // Format and print user's date of birth 4-
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM); //page 453
        // String dateOfBirthFormatted = dtf.format(dateOfBirth); String currentDateFormatted=dtf.format(currentDate);
        
        // If user's date of birth is not valid
        if (dateOfBirth.isAfter(currentDate)) {
        System.out.println("Date of birth must be before current date.");
        	}
        // If user's date of birth is valid
        else {System.out.println("Your date of birth is " + dtf.format(dateOfBirth) );
    
        // Format and print the current date
        	System.out.println("The current date is " + dtf.format(currentDate));

        // Calculate and print the user's age --page 451
        long age = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
            System.out.println("Your age is " + age);
        } 
    }
}