package task4;

public class MinMax {
	static class InnerClass{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		public String toString() {
			return "Min is " + min + " \nMax is " + max;
		}
	}
	
	InnerClass minmax(int values[]) {
		InnerClass ic = new InnerClass();
		for(int i = 0; i < values.length; i++) {
			if(values[i] > ic.max)
				ic.max = values[i];
			if(values[i] < ic.min)
				ic.min = values[i];
		}
		return ic;
	}
}
