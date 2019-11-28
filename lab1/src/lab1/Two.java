package lab1;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int area = a *a;
		int perimetr = 2 * a;
		double diagonal = Math.sqrt(a * a + a * a);
		System.out.println("a = " + area);
		System.out.println("p = " + perimetr);
		System.out.println("diag = " + diagonal);
	}

}
