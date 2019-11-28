package lab2;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		Analyzer a = new Analyzer();
		a.work();	
	}	
}
	
	class Data{
	private	double average = 0;
	private double max = 0;
	private int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	
	public void findAver(int cnt, int sum) {
		average = sum / cnt;
		
		if(average > 0)	System.out.println(cnt + ". Average = " + average);
		else System.out.println("Average = 0");
}
	
	public Data() {
		
	}
}
	class Analyzer{
		void work() {
			int cnt = 0;
			int sum = 0;
			
			Data d = new Data();
			while(true) {
			Scanner s = new Scanner(System.in);
			String quit = s.next();
			d.setNum(Integer.parseInt(quit));
			sum += d.getNum();
			cnt++;
			d.findAver(cnt, sum);
		}
	}
}
