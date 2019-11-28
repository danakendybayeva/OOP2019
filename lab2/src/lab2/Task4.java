package lab2;

import java.util.Scanner;

public class Task4 {
	
	static boolean setHour(int hour) {
		if(hour >= 0 && hour <= 24) return true;
		else return false;
	}
	static boolean setMS(int minute) {
		if(minute >= 0 && minute <= 60) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		int hour = 0;
		int minute = 0;
		int second = 0;
		Time t = new Time(9, 23, 40);
		/*
		Scanner sH = new Scanner(System.in);
		if(setHour(sH.nextInt())) hour = sH.nextInt();
		else System.out.println("Invalid number");
		
		Scanner sM = new Scanner(System.in);
		if(setMS(sH.nextInt())) minute = sH.nextInt();
		else System.out.println("Invalid number");
		
		Scanner sS = new Scanner(System.in);
		if(setMS(sH.nextInt())) minute = sH.nextInt();
		else System.out.println("Invalid number");
		*/
		System.out.println(t.universal());
		System.out.println(t.standart());
		}
}

class Time{
	int hour;
	int minute;
	int second;
	
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	String universal() {
		String s = "Universal " + hour + ":" + minute + ":" + second;
		return s;
	}
	String standart() {
		String day;
		if(hour >= 1 && hour <= 12) day = "AM";
		else day = "PM";
		if(hour > 12) hour -= 12;
		else hour = hour;
		String s = "Standart " + hour + ":" + minute + ":" + second + " " + day;
		return s;
	}
	void showBoth() {
		universal();
		standart();
		
	}
}
