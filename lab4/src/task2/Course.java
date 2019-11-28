package task2;

public class Course {
	private String courseTitle;
	Textbook t = new Textbook("1234", "OOP", "Pakita");
	Instructor in = new Instructor("Pakita", "Shamoi", "FIT", "hi@g");
	
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	Course(String courseTitle, Textbook t, Instructor in){
		this.courseTitle = courseTitle;
		this.t = t;
		this.in = in;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return courseTitle + " Instuctor name is " + in.toString() + ". Textbook is " + t.toString();
	}
	@Override
	public boolean equals(Object obj) {
        if(obj != null && this.getClass() == obj.getClass()){
            Course temp = (Course) obj;
            return temp.courseTitle.equals(courseTitle) && temp.in.equals(in) && temp.t.equals(t);
        }
        return false;	    
	}
}
