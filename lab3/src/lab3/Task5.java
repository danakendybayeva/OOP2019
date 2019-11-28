package lab3;

import java.util.*;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Object> v = new Vector<Object>();
		
		Scanner sc = new Scanner(System.in);
		
		Persons p = new Persons("dana", "dmis");
		Student stu1 = new Student("first", "street1", "is", 1, 2300);
		Staff sf1 = new Staff("math", "street1", "nis", 30000);
		v.add(p);
		v.add(stu1);
		v.add(sf1);
		
		String name, address, program, school;
		int year;
		double fee, pay;
		
		System.out.println("Insert all if u want to print info or add objectname if u want to add new object");
		  while(true)
		  {
			  String[] str = sc.nextLine().split(" ");
			  
			  if (str[0].equals("all"))
			  {
				   for(Object o: v) {
					   System.out.println(o);
				   }	
			  }
			  else if (str[0].equals("add") && str[1].equals("Person"))
			  {
				   name = str[2];
				   address = str[3];
				   System.out.println("ok");
				   Persons p1 = new Persons(name, address);
				   v.add(p1);
				   
				   
			  }else if (str[0].equals("add") && str[1].equals("Student"))
			  {
				   name = str[2];
				   address = str[3];
				   program = str[4];
				   year = Integer.parseInt(str[5]);
				   fee = Double.parseDouble(str[6]);
				   Student s1 = new Student(name, address, program, year, fee);
				   v.add(s1);
				   System.out.println("ok");
			  }
			  else if (str[0].equals("add") && str[1].equals("Staff"))
			  {
				   name = str[2];
				   address = str[3];
				   school = str[4];
				   pay = Double.parseDouble(str[6]);
				   
				   Staff st1 = new Staff(name, address, school, pay);
				   v.add(st1);
				   System.out.println("ok");
			  }
			  else if (str[0].equals("bye")) {
				  break;
			  }
				  
		 }
		  sc.close();
	}

}

class Persons{
	private String name;
	private String address;
	
	public Persons(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	String getName() {
		return name;
	}
	
	String getAddress() {
		return address;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	
	public String toString() {
		return "Person[name = " + name + ", address = " + address + "]";
	}
}

class Student extends Persons{
	
	private String program;
	private int year;
	private double fee;

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
		// TODO Auto-generated constructor stub
	}
	
	String getProgram() {
		return program;
	}
	
	void setProgram(String program) {
		this.program = program;
	}
	
	int getYear() {
		return year;
	}
	
	void setYear(int year) {
		this.year = year;		
	}
	
	double getFee() {
		return fee;
	}
	
	void setFee(double fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		
		return "Student " + super.toString() + " [program = " + program + ", year = " + year + ", fee = " + fee + "]";
	}
}

class Staff extends Persons{
	
	String school;
	double pay;

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
		// TODO Auto-generated constructor stub
	}
	
	String getSchool() {
		return school;
	}
	
	void setSchool(String school) {
		this.school = school;
	}
	
	double getPay() {
		return pay;
	}
	
	void setPay(double pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stuff " + super.toString() + " [school = " + school + ", pay = " + pay + "]";
	}
}