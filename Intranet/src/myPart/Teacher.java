package myPart;

public class Teacher extends User{
	public Teacher(String name, String surname) {
		super(name, surname);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'm teacher";
	}
}
