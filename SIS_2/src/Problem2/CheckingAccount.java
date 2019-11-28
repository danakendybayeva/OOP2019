package Problem2;

public class CheckingAccount extends Account{
	int counter;
	int freeTransaction = 3;
	double fee;
//	double balance = getBalance();

	public CheckingAccount(int a) {
		super(a);
		fee = 20;
		counter = 0;
	}
	
	public void deductFee() {
		double balance = getBalance();
		if(counter > freeTransaction)
			balance -= fee;
		setBalance(balance);
	}
	
	@Override
	public void deposit(double sum) {
		// TODO Auto-generated method stub
		super.deposit(sum);
		counter++;
	}
	
	@Override
	public void withdraw(double sum) {
		// TODO Auto-generated method stub
		super.withdraw(sum);
		counter++;
	}
	public int leftTransactions() {
		if((freeTransaction - counter) > 0) return freeTransaction - counter;
		else return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " and has " + leftTransactions() + " free transactions left";
	}
}
