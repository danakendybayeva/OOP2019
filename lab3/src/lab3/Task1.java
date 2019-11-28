package lab3;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat("pretty");
		System.out.println(cat.toString() + cat.sound());
		System.out.println("Cat can say meow few times, e.g. 3 times - " + cat.sound(3));
	}

}

class Animal{
	
	public String name;
	public Animal(String name) {
		this.name = name;
	}
	
	String sound() {
		return "No voice";
	}
	
	String sound(int x) {
		return sound();
	}
	
	public String toString() {		
		return "name is " + name + ". ";
	}
}

class Cat extends Animal{
	
	private int x;

	public Cat(String n) {
		super(n);
	}
	
	public String toString() {
		return "Cat's " + super.toString();
	}
	
	String sound(int x) {
		String s = "";
		for(int i = 0; i < x; i++) {
			s += "meow ";
		}
		return s;
	}

	String sound() {
		
		return "Cat says meow";		
	}
	
}