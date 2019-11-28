package myPart;
import java.util.*;

public class Student extends User{
	private String studentId, faculty;
	private int yearOfStudy = 1, credits;
	private boolean hasAccess;
	private double debt;
	private SortedSet<Transcript> semesters;
	private Schedule schedule;
	private Attendance attendance;
	
	public Student(String name, String surname) {
		super(name, surname);
	}

	public String getStudentId() {
		return studentId;
	}

	public String getFaculty() {
		return faculty;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public int getCredits() {
		return credits;
	}

	public boolean isHasAccess() {
		return hasAccess;
	}

	public void setHasAccess(boolean hasAccess) {
		this.hasAccess = hasAccess;
	}

	public double getDebt() {
		return debt;
	}

	public SortedSet<Transcript> getSemesters() {
		return semesters;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	Transcript t = new Transcript();
	public void registrateToCourse(Course course) {
		t.addCourse(course);
	}
	
	public void dropCourse(Course course) {
		
		t.dropCorse(course);
	}
	
	public void viewTranscript() {
		//deserialization
	}
	
	public void registrateToCourse(HashSet<Course> courses){
		t.addCourses(courses);
	}
	
	public void chooseTeacher(Course course, Teacher teacher) {
		Schedule s = new Schedule();
		s.setSchedule(course, teacher);
	}

	public Attendance getAttendance() {
		return attendance;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'm student";
	}
}
