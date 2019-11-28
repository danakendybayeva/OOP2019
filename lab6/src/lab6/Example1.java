package lab6;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int     denominator, numerator, ratio;

		numerator   = 5;
		denominator = 0;
		try {
			 ratio = numerator / denominator;
			 System.out.println("The answer is: "+ ratio);
		} catch (ArithmeticException a){
			System.out.println("Divide by 0.");
			a.printStackTrace();
		}
		
		System.out.println("Done."); // Don't move this line
	}

}
