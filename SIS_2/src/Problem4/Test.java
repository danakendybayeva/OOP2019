package Problem4;

import Problem3.Employee;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate c1 = new Chocolate("Twix", 3.2);
		Chocolate c2 = new Chocolate("Bounty", 4.2);
		Chocolate c3 = new Chocolate("Mars", 2.9);
		Chocolate c4 = new Chocolate("Maska", 1.5);
		Chocolate[] sweets = new Chocolate[4];
		sweets[0] = c1;
		sweets[1] = c2;
		sweets[2] = c3;
		sweets[3] = c4;
		Sort.bubbleSort(sweets);
		for(Chocolate c:sweets) {
			System.out.println(c.toString());
		}
		System.out.println("\n");
				
		Time t1 = new Time(12, 36, 12);
		Time t2 = new Time(4, 12, 33);
		Time t3 = new Time(12, 45, 33);
		Time t4 = new Time(20, 30, 22);
		Time[] times = new Time[4];
		times[0] = t1;
		times[1] = t2;
		times[2] = t3;
		times[3] = t4;
		Sort.bubbleSort(times);
		for(Time t : times) {
			System.out.println(t.universal());
		}
		System.out.println("\n");
		
		Employee e1 = new Employee("Adia", 200000);
		Employee e2 = new Employee("Bro", 120000);
		Employee e3 = new Employee("Lola", 60000);
		Employee e4 = new Employee("Mar", 78000);
		Employee[] employees = new Employee[4];
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		employees[3] = e4;
		Sort.bubbleSort(employees);
		for(Employee e : employees) {
			System.out.println(e.toString());
		}
	}

}
