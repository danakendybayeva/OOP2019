package task1;

public class UsingAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.animalName();
		c.move();
		
	}

}

abstract class Animal{
	abstract void animalName();
	
	void move() {
		System.out.println("This animal moves");
	}
}
//if the method is not abstract then you don't need to implement it

class Cat extends Animal{

	@Override
	void animalName() {
		// TODO Auto-generated method stub
		
	}
	
}