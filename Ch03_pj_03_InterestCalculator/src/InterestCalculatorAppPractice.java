import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorAppPractice //refer to p 107 for template
{

	public static void main(String[] args) {
	// welcome message
		System.out.println("Welcome to the interest calculator App Practice!");
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
 //perform conversions until choice isn't equal to "y" or "Y"	
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		//Get loan amount from the user: two things which are loan amount and interest rate only
			System.out.print("Enter loan amount:  ");
			//double loanAmt = sc.nextDouble();
			String loanAmtStr = sc.next();
			System.out.print("Enter interest rate:  ");
			String interestRateStr = sc.next();	
			System.out.println();
			
		// do the business logic and the math
		//Let calculate Interest Amount 	//use bigDecimal to properly round off
			BigDecimal loanAmt = new BigDecimal(loanAmtStr);
			BigDecimal interestRate = new BigDecimal(interestRateStr);
			BigDecimal interestAmt = loanAmt.multiply(interestRate);
			interestAmt = interestAmt.setScale(2, RoundingMode.HALF_UP);
			
		//create the numberFormat object for percentages and currency
			NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
			NumberFormat percentFormat = NumberFormat.getPercentInstance();
			percentFormat.setMaximumFractionDigits(2);
					
			//Finally, let display results
			System.out.println("Loan Amount:  "+currencyFormat.format(loanAmt) + "\n");
			System.out.println("Interest Rate:  "+percentFormat.format(interestRate) + "\n");
			System.out.println("Interst Amount:  "+currencyFormat.format(interestAmt));
			System.out.println("Continue?(y/n)");
			choice = sc.next();	
			
			System.out.println("Continue?(y/n)");	
		};
		choice = sc.next();
		sc.close();
		System.out.println("Bye!");
};
}
		