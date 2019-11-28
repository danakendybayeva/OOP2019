package lab3;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {

	  Employee e1 = new Employee("F", 100, 3, "1234a");
	  Employee e2 = new Employee("F", 100, 3, "1234a");
	  Employee e3 = new Employee("A", 100, 3, "1234f");
	  HashSet<Employee> sset=new HashSet<Employee>();
	  sset.add(e1);
	  sset.add(e2);
	  sset.add(e3);
	  System.out.println(sset);
	  System.out.println(sset.size());
	}

}

class Person{
	
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		return "Employee " + name;
	}
	
	public boolean equals(Object p) {
		if(p == null) return false;
		if(p == this) return true;
		if(!(p instanceof Person)) return false;
		Person otherPerson = (Person) p;
		return this.name.equals(otherPerson.name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name);
	}
}

class Employee extends Person{
	
	private double salary;
	private int year;
	private String insuranceNumber;
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, double salary, int year, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setInsNum(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public String getInsNum() {
		return insuranceNumber;
	}
	
	public String toString() {
		
		return super.toString() + "has salary " + salary + " and works here " + year + " years. His insurance number is " + insuranceNumber;
	}
	
	public boolean equals(Object e) {
		
		if(!(e instanceof Employee)) return false;
		
		Employee employee = (Employee) e;
		
		return super.equals(e) && employee.insuranceNumber.equals(insuranceNumber);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode() + Objects.hash(salary, year, insuranceNumber);
	}
}

class Manager extends Employee{
	
	Vector<Employee> members = new Vector<Employee>();
	double bonus = 0;
	
	public Manager(String name) {
		super(name);
	}
	public void addEmployeeToTeam(Employee e) {
		members.add(e);
	}
	
	public void addBonus(int x) {
		bonus += x;
	}

	public String toString() {
		
		return null;
	}
	
	public boolean equals(Object m) {
		if(!(m instanceof Manager)) return false;
		
		Manager mang = (Manager) m;
		
		return super.equals(m);
	}
	
}