package Problem3;

import java.util.*;

public class Manager extends Employee implements Comparable, Cloneable{
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name, salary, hireDate, insuranceNumber);
		// TODO Auto-generated constructor stub
	}
	double bonus = 0;

	public void addBonus(int x) {
		bonus += x;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager " + super.toString();
	}
	
	public boolean equals(Object m) {
		if(!(m instanceof Manager)) return false;
		
		Manager mang = (Manager) m;
		
		return super.equals(m);
	}
	@Override
	public int compareTo(Object arg0) {
		Manager other = (Manager) arg0;		
		if(super.compareTo(other) == 0) {
			if (bonus < other.bonus) return -1;
			if (bonus > other.bonus) return 1;
		}
		return super.compareTo(other);
	}
	
}
