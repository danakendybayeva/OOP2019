package lab1;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		
		if (grade > 94) {
			System.out.println("A");
		}else if (grade >= 94 && grade <= 90) {
			System.out.println("A-");
		}else if (grade >= 85 && grade <= 89) {
			System.out.println("B+");
		}else if (grade >= 80 && grade <= 84) {
			System.out.println("B-");
		}else if (grade >= 75 && grade <= 79) {
			System.out.println("B-");
		}else if (grade >= 70 && grade <= 74) {
			System.out.println("C+");
		}else if (grade >= 65 && grade <= 69) {
			System.out.println("C");
		}else if (grade >= 60 && grade <= 64) {
			System.out.println("C-");
		}else if (grade >= 55 && grade <= 59) {
			System.out.println("D+");
		}else if (grade >= 50 && grade <= 54) {
			System.out.println("D");
		}else if (grade >= 0 && grade <= 49) {
			System.out.println("F");
		}else System.out.println("Not valid");
		
			
		
		
		
		
	}

}
