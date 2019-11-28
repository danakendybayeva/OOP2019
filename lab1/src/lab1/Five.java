package lab1;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int initial = scan1.nextInt();
		
		double interest = 5;
		
		double new_balance = initial * (1 + interest / 100);
		
		System.out.println("Your new balance is " + new_balance);

	}

}
