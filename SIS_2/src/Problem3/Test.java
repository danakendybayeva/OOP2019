package Problem3;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		Date d2 = new Date(120, 0, 23);
//		System.out.println(d1);
//		System.out.println(e1.compareTo(e2));
		Employee e1 = new Employee("fds", 30000, d1, "43");
		Employee e2 = new Employee("dad", 350000, d2, "65");
		Manager m1 = new Manager("few", 4300, d2, "432q3");
		Manager m2 = new Manager("dsa", 4300, d2, "31");
		m1.addBonus(3000);
//		System.out.println(e1.compareTo(e2));
//		System.out.println(m1.compareTo(m2));
		Vector<Employee> eee = new Vector<Employee>();
		eee.add(e1);
		eee.add(e2);
		Collections.sort(eee, new HireDateComparator());
		System.out.println("Employees");
		for(Employee q : eee) {
			System.out.println(q.toString());
		}
		Vector<Manager> mmm = new Vector<Manager>();
		mmm.add(m1);
		mmm.add(m2);
		Collections.sort(mmm, new NameComparator());
		System.out.println("Managers");
		for(Manager q : mmm) {
			System.out.println(q.toString());
		}
	}

}
