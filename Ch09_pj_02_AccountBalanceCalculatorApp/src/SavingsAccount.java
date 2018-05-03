

public class SavingsAccount extends Account {
	
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	public SavingsAccount(double balance, double mir) {
		super(balance);
		monthlyInterestRate = mir;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}

	public void applyPaymentToBalance() {
		monthlyInterestPayment = balance * monthlyInterestRate;
		balance += monthlyInterestPayment;
	}
}
