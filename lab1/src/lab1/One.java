package lab1;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int size = s.length();
		String minus = "";
		for(int i = 0; i < size; i++) {
			minus += "-";
		}
		System.out.println("+" + minus + "+");
		System.out.println("|"+ s + "|");
		System.out.println("+" + minus + "+");
	}

}
