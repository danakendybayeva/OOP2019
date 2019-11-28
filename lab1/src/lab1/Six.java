package lab1;

import java.util.Scanner;

public class Six {
	
	static boolean isPalindrome(String s)
    {
        if (s.length() <= 1)
            return true;
        else
        {
            if (s.charAt(0) != s.charAt(s.length() - 1))
                return false;
            else
                return isPalindrome(s.substring(1, s.length() - 2));
        }
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		if (isPalindrome(s)) System.out.println("yes");
		else System.out.println("no");
	}

}
