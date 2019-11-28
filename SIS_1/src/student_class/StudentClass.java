package student_class;

public class StudentClass{
	String name;
	String id;
	int year = 2;
	
	public StudentClass(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + " " + name + " " + year;
	}
	public void increamentYear()
   {
       year++;
   }
}