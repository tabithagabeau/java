import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ch03_pj_3_3_InterestPercentNumberFormatPractice {
	
	public static void Main (String[] args) {
		System.out.println("Welcome to my cool app!");
		
	Scanner sc = new Scanner(System.in);
	String choice ="y";
	
	while (choice.equalsIgnoreCase("y")) {
		System.out.println("Enter Loan Amount:");
		String loanAmtStr = sc.next();
		System.out.println("Enter Interest Rate:");
		String interestRateStr= sc.next();
	
		BigDecimal loanAmt= new BigDecimal (loanAmtStr);
		BigDecimal interestRate = new BigDecimal (interestRateStr);
		BigDecimal interestAmt = loanAmt.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);
		//To do: find out why it is 500%
		
		//Currency and percent conversion of results
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
			percentFormat.setMaximumFractionDigits(2);
		
	System.out.println("Loan Amount:" + currencyFormat.format(loanAmt) + "\n");	
	System.out.println("Interest Rate" + percentFormat.format(interestRate) + "\n");	
	System.out.println("Interest Amount:" + currencyFormat.format(interestAmt) + "\n");	
		
		System.out.println("Continue? (y/n)");
		choice=sc.next();
	}
		
		sc.close();
	}

}
