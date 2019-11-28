package check;

import java.util.Scanner;

public class Datas {

	public static void main(String[] args) {
		  Analyzer a = new Analyzer();
		  a.methodA();
		}
	}
	class Data {
		 private int counter = 0;
		 private double max = -10000;
		 private double sum = 0;
		 
		 public Data()
		 {
		  
		 }
		 
		 public void addData(int input)
		 {
			 sum+=input;
			 counter++;
		  
		 if (input > max) {
			   double doubleOfInput = input;
			   max = input;
		 }
	}
		 
		 public double average()
		 {
			 return (sum / counter);
		 }
		 
		 public double maxOfInput()
		 {
			 return max;
		 }
		 
	}
	
		class Analyzer{
			Scanner sc = new Scanner(System.in);
			
			public void methodA()
			 {
				Data data = new Data();
				while (true) {
				String inputData = sc.nextLine();
			  
				if (inputData.equals("q")) {
					System.out.println("Average = " + data.average());
					System.out.println("Max = " + data.maxOfInput());
				}
				else   data.addData(Integer.parseInt(inputData));
		}	 
	}
}
