package myPart;

import java.util.*;

public class Transcript {
	private int year;
	private String semester;
	private HashMap<Course, Mark> courses;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
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
	
	public void setMark(Course course, double m, Attestation att) {
		Mark mark = new Mark();
		if(att == Attestation.FIRST) {
			mark.setFirstAttestation(m);
			courses.replace(course, mark);
		}
		if(att == Attestation.SECOND) {
			mark.setSecondAttestation(m);
			courses.replace(course, mark);
		}
		if(att == Attestation.FINAL) {
			mark.setFinalMark(m);
			courses.replace(course, mark);
		}
	}
}
