package lab3;

import java.util.*;

public class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		return "Employee " + name;
	}
	
	public boolean equals(Object p) {
		if(p == null) return false;
		if(p == this) return true;
		if(!(p instanceof Person)) return false;
		Person otherPerson = (Person) p;
		return this.name.equals(otherPerson.name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name);
	}
}
