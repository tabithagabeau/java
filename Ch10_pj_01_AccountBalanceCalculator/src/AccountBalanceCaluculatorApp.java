import java.text.NumberFormat;

import yourLasstName.presentation.Console;
import yourLastName.App.Account;
import yourLastName.App.CheckingAccount;
import yourLastName.App.SavingsAccount;

public class AccountBalanceCaluculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance Calculator");

		CheckingAccount ca = new CheckingAccount(1000,1);
		SavingsAccount sa = new SavingsAccount(1000,.01);
		System.out.println("Starting Balances");
		
		displayBalances(ca, sa);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter the transactions for the month");
			String action = Console.getString("Withdraw or Deposit? (w/d)", "w", "d");
			String account = Console.getString("Account? (c/s):  ", "c", "s");
			double amount = Console.getDouble("Amount?  ", 0, 1000);
			
			// set account 
	        Account a;
	        if (account.equalsIgnoreCase("c")) {  
	            a = ca;
	        } else {  
	            a = sa;
	        }
	        
			if (action.equalsIgnoreCase("w")) {
				a.withdraw(amount);
			}
			else  {
				a.deposit(amount);
			}
			choice = Console.getString("Continue?(y/n)  ", "y", "n");
		}	
		
		displayFinalPaymentsAndFees(ca, sa);
		
		System.out.println("Final Balances");
		displayBalances(ca, sa);
		
		System.out.println("Bye");
	}

	private static void displayBalances(CheckingAccount ca, SavingsAccount sa) {
		
		System.out.println("Checking:  "+ca.getBalanceFormatted());
		System.out.println("Savings:  "+sa.getBalanceFormatted());
	}
	
	private static void displayFinalPaymentsAndFees(CheckingAccount ca, SavingsAccount sa) {
		ca.subtractMonthlyFee();
		sa.applyPaymentToBalance();
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking Fee:  "+ca.getMonthlyFee());
		System.out.println("Savings interest payment:  "+sa.getMonthlyInterestPayment());
	}
}