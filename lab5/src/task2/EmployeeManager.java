package task2;
import java.util.*;
import lab3.*;
public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		Date d2 = new Date(2018, 0, 23);
//		System.out.println(d1);
//		System.out.println(e1.compareTo(e2));
		Employee e1 = new Employee("fds", 30000, d1, "43");
		Employee e2 = new Employee("dad", 350000, d2, "65");
		Manager m1 = new Manager("few", 4300, d2, "432q3");
		Manager m2 = new Manager("dsa", 4300, d2, "31");
		m1.addBonus(3000);
//		System.out.println(e1.compareTo(e2));
		System.out.println(m1.compareTo(m2));
	}

}
