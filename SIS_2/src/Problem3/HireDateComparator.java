package Problem3;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getYear().compareTo(e2.getYear());
	}
}
