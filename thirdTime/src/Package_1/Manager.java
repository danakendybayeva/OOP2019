package Package_1;

import java.io.IOException;
import java.lang.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import Package_1.*;

public class Manager extends Employee {
    private TypesOfManager typeOfManager;
    private List<String> news;
    private HashSet<Course> coursesForRegister;
    private Faculty faculty;
    
    public Manager(String userName, String password, String firstName, String lastName, int salary) {
    	super(userName, password, firstName, lastName, salary);
    	this.typeOfManager = TypesOfManager.OR;
    	faculty = Faculty.NONE;
    }
    
    public Manager(String userName, String password, String firstName, String lastName, int salary, Faculty faculty) {
    	super(userName, password, firstName, lastName, salary);
    	this.typeOfManager = TypesOfManager.OR;
    	this.faculty = faculty;
    }

    /**
     * adds news
     * @param news 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void addNews(String news) throws ClassNotFoundException, IOException {
    	Singletone.addNews(news);
    }

    /**
     * creates the list of courses that can be taken in semester
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void addRegistrateCourses(Course course, HashSet<Teacher> teachers) throws ClassNotFoundException, IOException {
    	Singletone.addRegistrateCourses(course, teachers);
    }

    /**
     * creates statistic report
     */
    public void createStatisticReport() {
    	
    }

    /**
     * shows information about employee
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void viewInfoAboutEmployee(Employee employee) throws ClassNotFoundException, IOException {
    	Singletone.viewInfoAboutEmployee(this, employee);
    }

    /**
     * gives information about student
     * @param student 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void viewStudentInfo(Student student) throws ClassNotFoundException, IOException {
    	Singletone.viewInfoAboutStudent(student);
    }
}

