package sis;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Temperature t1 = new Temperature(65, 'F');
		t1.print();
		
		Temperature t2 = new Temperature();
		t2.print();
		
		Temperature t3 = new Temperature(45);
		t3.print();
				
		Temperature t4 = new Temperature('F');
		t4.print();
		
		Temperature t5 = new Temperature(30, 'C');
		
		System.out.println(t1.toC());
		System.out.println(t5.toF());
		
		t3.setScale('F');
		t3.setDegree(78);
		t3.print();
		
		t2.setTemper(56, 'C');		
		t2.print();
				
		System.out.println(t2.getScale());
	}

}

class Temperature{
	private double degree;
	private char scale;
		
	public void setDegree(double degree) {
		this.degree = degree;
	}
	
	public double getDegree() {
		return degree;
	}
	
	public void setScale(char scale) {
		this.scale = scale;
	}
	
	public char getScale() {
		return scale;
	}
	
	public Temperature(double degree, char scale) {
		this.degree = degree;
		this.scale = scale;
	}
	
	public Temperature() {
		degree = 0;
		scale = 'C';
	}
	
	public Temperature(double degree) {
		this.degree = degree;
		scale = 'C';
	}
	
	public Temperature(char scale) {
		this.scale = scale;
		degree = 0;
	}
	
	public void print() {
		String s =  degree + " " + scale;
		System.out.println(s);
	}

	public String toF() {
		double degreeF = (9 * (degree / 5)) + 32;
		scale = 'F';
		return degreeF + " " + scale;
	}
	
	public String toC() {
		double degreeC = 5 * (degree - 32) / 9;
		scale = 'C';
		return degreeC + " " + scale;
	}
	
	public void setTemper (double degree, char scale) {
		this.degree = degree;
		this.scale = scale;
	}
}
