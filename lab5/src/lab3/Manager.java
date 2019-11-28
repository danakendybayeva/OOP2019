package lab3;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Comparable{
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name, salary, hireDate, insuranceNumber);
		// TODO Auto-generated constructor stub
	}
	double bonus = 0;
	
	
	
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
	@Override
	public int compareTo(Object arg0) {
		Manager other = (Manager) arg0;
//		if (getSalary() < other.getSalary()) return -1;
//		if (getSalary() > other.getSalary()) return 1;
		
		if(super.compareTo(other) == 0) {
			if (bonus < other.bonus) return -1;
			if (bonus > other.bonus) return 1;
		}
		return super.compareTo(other);
	}
}
