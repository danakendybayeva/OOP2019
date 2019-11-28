package Problem2;

import java.util.Vector;

public class Bank {
	
	Vector<Account> accounts = new Vector<Account>();
	
	public void update() {
		for(Account a: accounts) {
			a.deposit(9);
			if(a instanceof SavingsAccount) {
				SavingsAccount sa = (SavingsAccount) a;
				sa.deposit(1000);
				sa.addInterest();
			}else if(a instanceof CheckingAccount) {
				CheckingAccount ca = (CheckingAccount) a;
				ca.deductFee();
			}
				Account acc = (Account) a;
				acc.transfer(290, a);
			
		}
	}
	
	public void openAcc(Account acc) {
		accounts.add(acc);
	}
	
	public void closeAcc(Account acc) {
		accounts.remove(acc);
	}
}
