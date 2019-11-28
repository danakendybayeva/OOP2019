package lab2;

public class Task5 {
	
	public static void main(String[] args) {
		
	}

}

class Sum{
	
	public enum Operations {
		SUM, DIFFERENCE, DIVISION, MULTIPLICATION
	}
	private int a;
	private int b;
	private int number;
	String operation = null;
	static final String s = "Starting calculations";
	
	
	Sum(int a, int b, int number) {
		this.a = a;
		this.b = b;		
		this.number = number;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
