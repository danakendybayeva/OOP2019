package Problem2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		Account a1 = new SavingsAccount(54352, 15);
		b.openAcc(a1);
		a1.deposit(340);
		Account a2 = new CheckingAccount(14245);
		b.openAcc(a2);
		a2.deposit(230);
		a2.deposit(120);
		Account a3 = new Account(52158);
		b.openAcc(a3);
		a3.deposit(120);
		
		b.update();
		a1.print();
		a2.print();
		a3.print();
	}

}
