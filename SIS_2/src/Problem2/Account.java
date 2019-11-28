package Problem2;

public class Account {
	private double balance; //The current balance
	private int accNumber; //The account number
	public Account(int a)
	{		
		balance = 0.0;
		this.accNumber = a;
	}
	public void deposit(double sum) { 
		balance += sum;
	}
	public void withdraw(double sum) {
		if (balance >= sum)
			balance -= sum;
		else 
		{
			System.out.println("Not enough money to withfraw");
		}
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public double getAccountNumber(){
		return accNumber;
	}
	public void transfer(double amount, Account other){
		this.balance -= amount;
		other.balance += amount;
	}
	public String toString() {
		return accNumber + " has balance " + getBalance();
	}
	public final void print()
	{
	 //Don't override this,override the toString method
	 System.out.println( toString() );
	} 
}
