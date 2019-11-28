package task4;

import task4.MinMax.InnerClass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 32, 0, 2, -3, 23, 12, 7};
		MinMax m = new MinMax();
		InnerClass p = m.minmax(a);
		System.out.println(p.toString());
	}

}