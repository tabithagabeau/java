
public class CheckingAccount extends Account {

	private double monthlyFee;
	
	public CheckingAccount(double balance, double mFee) {
		super(balance);
		monthlyFee = mFee;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	public void subtractMonthlyFee() {
		balance -= monthlyFee;
	}
}