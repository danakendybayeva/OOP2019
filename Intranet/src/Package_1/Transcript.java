 package Package_1;

import java.io.Serializable;
import java.util.*;

public class Transcript implements Serializable, Comparable, Cloneable{
	private int year;
	private Semester semester;
	private HashMap<Course, Mark> courses;
	
	{
		courses = new HashMap<Course, Mark>();
	}
	
	public Transcript(int year) {
		this.year = year;
		this.semester = Semester.AUTUMN;
	}
	
	public Transcript(int year, Semester semester) {
		this.year = year;
		this.semester = semester;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Semester getSemester() {
		return semester;
	}
	
	public void setSemester(Semester semester) {
		this.semester = semester;
	}
	
	public HashMap<Course, Mark> getCourses() {
		return courses;
	}
	
	public void setCourses(HashMap<Course, Mark> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course) {
		courses.put(course, null);
	}
	
	public void addCourses(HashSet<Course> course) {
		for(Course c : course) {
			courses.put(c, null);
		}
	}
	
	public void dropCorse(Course course) {
		courses.remove(course);
	}
	
	public void setMark(Course course, Mark m) {
		if(courses.containsKey(course)) courses.remove(course);
		 courses.put(course, m);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = null;
		for(Course key: courses.keySet()) {
			s += key + " - " + courses.get(key) + "\n";
		}
		return year + " year " + semester + " semester \n" + s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courses == null) ? 0 : courses.hashCode());
		result = prime * result + ((semester == null) ? 0 : semester.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transcript other = (Transcript) obj;
		if (courses == null) {
			if (other.courses != null)
				return false;
		} else if (!courses.equals(other.courses))
			return false;
		if (semester == null) {
			if (other.semester != null)
				return false;
		} else if (!semester.equals(other.semester))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Transcript t  = (Transcript) arg0;
		if(year == t.getYear()) return semester.compareTo(t.getSemester());
		if(year > t.getYear()) return 1;
		if(year < t.getYear()) return -1;
		return 0;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Transcript cloned = (Transcript)super.clone();
		cloned.courses = (HashMap<Course, Mark>) courses.clone();
		return cloned;
	}
}
