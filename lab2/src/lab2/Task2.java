package lab2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		StarTriangle first = new StarTriangle(n);
		first.toString();
	}
	
}

class StarTriangle{
	
	int n;
		
	StarTriangle(int width){
		n = width;
	}
	public String toString(){
		
		String arr[][] = new String[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                arr[i][j] = "[*]";
                System.out.print(arr[i][j]);
            }
                
            System.out.println("");
        }
		return null;
	}
}
