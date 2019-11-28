package lab1;

import java.lang.Math; 
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int a = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int b = scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		int c = scan3.nextInt();
		
		double x1, x2;
		
		int d = b * b - 4 * a * c;
		if (d < 0) System.out.println("No roots");
		else if (d == 0) {
			x1 = -(b / 2 *a);
			System.out.println("x = " + x1);
		}else {
			x1 = -(b + Math.sqrt(d)) / 2 * a;
			x2 = -(b - Math.sqrt(d)) / 2 * a;
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		

	}

}
