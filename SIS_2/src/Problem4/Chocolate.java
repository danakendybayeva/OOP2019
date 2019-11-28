package Problem4;

public class Chocolate extends Sort implements Comparable{

	String name;
	double weight;
	public Chocolate(String name, double weight) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.weight = weight;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Chocolate other = (Chocolate) arg0;
//		if (weight < other.weight) return -1;
//		if (weight > other.weight) return 1;
		if(other.name.compareTo(this.name) == 0) {
			if (weight < other.weight) return -1;
			if (weight > other.weight) return 1;
		}
		return other.name.compareTo(this.name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " has weight " + weight;
	}
}
