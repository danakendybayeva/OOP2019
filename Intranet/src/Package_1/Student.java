package Package_1;
import java.util.*;

public class Student extends User{
	private String studentId;
	Faculty faculty;
	private int beginYear;
	private int yearOfStudy = 1, credits;
	private boolean hasAccess;
	private double debt;
	private SortedSet<Transcript> semesters;
	private Transcript transcript;
	private Schedule schedule;
	private Attendance attendance;
	
	public Student(String userName, String password, String firstName, String lastName, String studentId, int beginYear,  Faculty faculty) {
		super(userName, password, firstName, lastName);
		this.studentId = studentId;
		this.faculty = faculty;
		transcript = new Transcript(beginYear);
	}
	
	public Student(String userName, String password, String firstName, String lastName, String studentId, int beginYear,  Faculty faculty,
			SortedSet<Transcript> semesters) {
		this(userName, password, firstName, lastName, studentId,  beginYear, faculty);
		this.semesters = semesters;
	}

	public String getStudentId() {
		return studentId;
	}
	
	public void setMark(Course c, Mark m) {
		transcript.setMark(c, m);
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy() {
		this.yearOfStudy += 1;
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
	
	public void registrateToCourse(Course course) {
		transcript.addCourse(course);
	}
	
	public void dropCourse(Course course) {
		transcript.dropCorse(course);
	}
	
	public void viewTranscript() {
		for(Transcript transcript: semesters) {
			System.out.println(transcript);
		}
	}
	
	public void registrateToCourse(HashSet<Course> courses){
		transcript.addCourses(courses);
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
		return "Student " + getFirstName() + " " + getLastName() + " , year " + yearOfStudy + " faculty " + faculty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attendance == null) ? 0 : attendance.hashCode());
		result = prime * result + beginYear;
		result = prime * result + credits;
		long temp;
		temp = Double.doubleToLongBits(debt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + (hasAccess ? 1231 : 1237);
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		result = prime * result + ((semesters == null) ? 0 : semesters.hashCode());
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		result = prime * result + ((transcript == null) ? 0 : transcript.hashCode());
		result = prime * result + yearOfStudy;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (attendance == null) {
			if (other.attendance != null)
				return false;
		} else if (!attendance.equals(other.attendance))
			return false;
		if (beginYear != other.beginYear)
			return false;
		if (credits != other.credits)
			return false;
		if (Double.doubleToLongBits(debt) != Double.doubleToLongBits(other.debt))
			return false;
		if (faculty != other.faculty)
			return false;
		if (hasAccess != other.hasAccess)
			return false;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		if (semesters == null) {
			if (other.semesters != null)
				return false;
		} else if (!semesters.equals(other.semesters))
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		if (transcript == null) {
			if (other.transcript != null)
				return false;
		} else if (!transcript.equals(other.transcript))
			return false;
		if (yearOfStudy != other.yearOfStudy)
			return false;
		return true;
	}
	
	public int compareTo(Object o) {
		Student s = (Student) o;
		return studentId.compareTo(s.getStudentId());
	}
}
