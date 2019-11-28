package lab3;

import java.util.*;

public class Employee extends Person implements Comparable{
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setYear(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public Date getYear() {
		return hireDate;
	}
	
	public void setInsNum(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public String getInsNum() {
		return insuranceNumber;
	}
	
	public String toString() {
		
		return super.toString() + "has salary " + salary + " and works here " + hireDate + " years. His insurance number is " + insuranceNumber;
	}
	
	public boolean equals(Object e) {
		
		if(!(e instanceof Employee)) return false;
		
		Employee employee = (Employee) e;
		
		return super.equals(e) && employee.insuranceNumber.equals(insuranceNumber);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode() + Objects.hash(salary, hireDate, insuranceNumber);
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Employee other = (Employee) arg0;
		if (salary < other.salary) return -1;
		if (salary > other.salary) return 1;
		return 0;
	}
}
