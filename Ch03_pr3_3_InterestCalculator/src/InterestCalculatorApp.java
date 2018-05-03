

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the interest calculator!");

		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter loan amount:  ");
			//double loanAmt = sc.nextDouble();
			String loanAmtStr = sc.next();
			BigDecimal loanAmt = new BigDecimal(loanAmtStr);
			// to catch expections
			try {
				int i = sc.nextInt();
			}
			catch (InputMismatchException e ) {
				System.out.println("Error... please enter a valid intiger");
			}
		
			
			System.out.print("Enter interest rate:  ");
			double interestRate = sc.nextDouble();
			
			
			NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
			NumberFormat percentFormat = NumberFormat.getPercentInstance();
			percentFormat.setMaximumFractionDigits(3);
			
			//calculate interest
			BigDecimal interestAmt = new BigDecimal(loanAmt.doubleValue()*interestRate);
		
			
			
			System.out.println("Loan Amount:  "+currencyFormat.format(loanAmt));
			System.out.println("Interest Rate:  "+percentFormat.format(interestRate));
			System.out.println("Interst Amount:  "+currencyFormat.format(interestAmt.doubleValue()));
			System.out.println("Continue?(y/n)");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("Bye!");
	}

}