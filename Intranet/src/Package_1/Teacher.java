package Package_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.*;
import java.util.ArrayList;
import java.util.HashSet;

import Package_1.*;

/**
 */
public class Teacher extends Employee implements Cloneable {
    private Degree degree;
    
    public Teacher(String userName, String password, String firstName, String lastName, int salary, Degree degree) throws FileNotFoundException, UnsupportedEncodingException {
    	super(userName, password, firstName, lastName, salary);
    	this.degree = degree;
    	Singletone.createCourseFile(this);
    }
    
    public void setCourseFiles(HashSet<CourseFile> courseFiles) throws ClassNotFoundException, IOException {
    	Singletone.setCourseFiles(this, courseFiles);
    }
    
    public HashSet<CourseFile> getCourseFiles() throws ClassNotFoundException, IOException {
    	return Singletone.getCourseFiles(this);
    }
    
    public Degree getDegree() {
    	return degree;
    }
    
    public void setDegree(Degree degree) {
    	this.degree = degree;
    }

    /**
     * shows information about student from teacher's course
     * @param student 
     * @param course 
     * @return 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void viewStudentInfo(Student student, Course course) throws ClassNotFoundException, IOException {
        Singletone.viewInfoAboutStudent(this, student, course);
    }

    /**
     * shows information of all students from teacher's course
     * @param course 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void viewStudentsInfo(Course c) throws ClassNotFoundException, IOException {
    	Singletone.viewInfoAboutStudent(this, c);
    }

    /**
     * puts mark to student in the course
     * @param student 
     * @param course 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void putMark(Student student, Course course, Mark mark) throws ClassNotFoundException, IOException {
    	Singletone.putMark(this, course, student, mark);
    }

    /**
     * puts mark to all student at once
     * @param course 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void putMarks(Course course, ArrayList<Mark> marks) throws ClassNotFoundException, IOException {
    	Singletone.putMarks(this, course, marks);
    }

    /**
     * shows files of teacher of specific course
     * @param course 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void viewCourseFiles() throws ClassNotFoundException, IOException {
    	HashSet<CourseFile> courseFiles = Singletone.getCourseFiles(this);
    	for(CourseFile courseFile:courseFiles) {
    		System.out.println(courseFile);
    	}
    }

    /**
     * shows the list of courses that teacher teaches
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void viewCourses() throws ClassNotFoundException, IOException {
    	Singletone.viewCourses(this);
    }

    /**
     * adds new course
     * @param course 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void addCourse(Course course) throws ClassNotFoundException, IOException {
    	Singletone.addCourse(this, course);
    }

    public void removeCourse(Course course) throws ClassNotFoundException, IOException {
        Singletone.removeCourse(this, course);
      }

    /**
     * set time for course to be held during the week, it will be used in schedule making
     * @param course 
     * @param time 
     * @param day 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void setTime(Course course, DayAndTime dayTime) throws ClassNotFoundException, IOException {
    	Singletone.setTime(this, course, dayTime);
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (degree != other.degree)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTeacher [degree=" + degree + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Teacher cloned = (Teacher) super.clone();
		return cloned;
	}
}

