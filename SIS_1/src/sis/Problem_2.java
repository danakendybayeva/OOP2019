package sis;

import student_class.StudentClass;
import java.util.*;

public class Problem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}

class GradeBook{
	Course oop = new Course("CS101 Object-oriented Programming and Design", 3);
	
	ArrayList<StudentClass> ss = new ArrayList<StudentClass>();	
	
	public void addToList(StudentClass stu) {
		ss.add(stu);
	}
	
	public void displayMessage() {
		System.out.println("Welcome to " + oop.name + "!");
	}
	
}

class Course{
	String name;
	String description;
	int credit_num;
	Vector<String> prerequisites;
	
	public Course(String name, int credit_num) {
		this.name = name;
		this.credit_num = credit_num;
	}
	
	public void setDescrip(String s) {
		description = s;
	}
	
	public void setPrereq(String s) {
		prerequisites.add(s);
	}
	
	public String toString() {
		return name + " " + credit_num + " credits, " + description + ". Prerequisites are " + prerequisites;
	}
}

class GradeBookTest{
	
	StudentClass dana = new StudentClass("1", "Dana");	
	StudentClass dilya = new StudentClass("2", "Dilya");
	StudentClass aliya = new StudentClass("3", "Aliya");
	
	
}
