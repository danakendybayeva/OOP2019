package Problem2;

public class SavingsAccount extends Account{
	
	double interestRate;
//	double balance = getBalance();

	public SavingsAccount(int a, double interestRate) {
		super(a);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double balance = getBalance();
		balance = balance * (1 + (interestRate / 100));
		setBalance(balance);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " and has interest rate = " + interestRate;
	}
}
