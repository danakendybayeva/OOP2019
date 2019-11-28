package Problem3;

import java.util.*;

public class Employee extends Person implements Comparable, Cloneable{
	
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
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
		
		return super.toString() + " has salary " + salary + " works here from " + hireDate;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Employee other = (Employee) arg0;
		if (salary < other.salary) return -1;
		if (salary > other.salary) return 1;
		return 0;
	}
	
	public Employee clone() throws CloneNotSupportedException{
		Employee cloned = (Employee)super.clone();
		cloned.hireDate = (Date)hireDate.clone();
		return cloned;
	}

}

