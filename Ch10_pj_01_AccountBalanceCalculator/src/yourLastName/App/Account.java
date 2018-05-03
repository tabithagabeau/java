package yourLastName.App;
import java.text.NumberFormat;

import yourLasstName.interfaces.Balanceable;
import yourLasstName.interfaces.Depositable;
import yourLasstName.interfaces.Withdrawable;

public class Account implements Balanceable, Depositable, Withdrawable {

	protected double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
	}
	
	// Get a string representing the currency formatted balance
	public String getBalanceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(balance);
	}
}
