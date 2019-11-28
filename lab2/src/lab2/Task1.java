package lab2;

public class Task1 {
	
	public static void main(String[] args) {
		Student dana = new Student("18BD11850", "Dana");
		dana.getData();
		dana.increamentYear();
		dana.getData();
	}
}

class Student{
	String name;
	String id;
	int year = 2;
	
	public Student(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void getData() {
		System.out.println(id + " " + name + " " + year);
	}
	public void increamentYear()
    {
        year++;
    }
}