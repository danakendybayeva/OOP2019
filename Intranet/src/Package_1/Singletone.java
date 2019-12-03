package Package_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Singletone {
	private Singletone singletone = new Singletone();
	private Singletone() {
		
	}
	
	public static boolean findUser(String userName) throws IOException, ClassNotFoundException {
		if(check("Database/Users")) {
			FileInputStream fis = new FileInputStream("Database/Users");
			ObjectInputStream oin = new ObjectInputStream(fis);
			HashSet<User> users = (HashSet<User>) oin.readObject();
			for(User user:users) {
				if(user.getUserName().equals(userName)) return true;
			}
		}
		
		return false;
	}
	
	public static User getUser(String userName) throws ClassNotFoundException, IOException {
		if(check("Database/Users")) {
			FileInputStream fis = new FileInputStream("Database/Users");
			ObjectInputStream oin = new ObjectInputStream(fis);
			HashSet<User> users = (HashSet<User>) oin.readObject();
			for(User user:users) {
				if(user.getUserName().equals(userName)) return user;
			}
		}
		
		return null;
	}
	
	public static void showNews() throws IOException, ClassNotFoundException {
		if(check("Database/News")) {
			FileInputStream fis = new FileInputStream("Database/News");
			ObjectInputStream oin = new ObjectInputStream(fis);
			TreeMap<Date, String> news = (TreeMap<Date, String>) oin.readObject();
			
			for(Date key:news.descendingKeySet()) {
				System.out.println(key + ": " + news.get(key));
			}
			
			oin.close();
			fis.close();
		}else {
			System.out.println("Do not have any news");
		}
	}
	
	public static void addOrder(Order o) throws IOException, ClassNotFoundException {
		HashSet<Order> orders = new HashSet<Order>();
		if(check("Database/Orders")) {
			FileInputStream fis = new FileInputStream("Database/Orders");
			ObjectInputStream oin = new ObjectInputStream(fis);
			orders = (HashSet<Order>) oin.readObject();
			
			oin.close();
			fis.close();
		}
		
		orders.add(o);
		FileOutputStream fos = new FileOutputStream("Database/Orders");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(orders);
		
		out.close();
		fos.close();
	}
	
	public static void addUser(User user) throws ClassNotFoundException, IOException {
		HashSet<User> users = new HashSet<User>();
		if(check("Database/Users")) {
			FileInputStream fis = new FileInputStream("Database/Users");
			ObjectInputStream oin = new ObjectInputStream(fis);
			users = (HashSet<User>) oin.readObject();
			
			oin.close();
			fis.close();
		}
		
		users.add(user);
		FileOutputStream fos = new FileOutputStream("Database/Users");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(users);
		
		out.close();
		fos.close();
		
		if(user instanceof Employee) {
			HashSet<Employee> employees = new HashSet<Employee>();
			if(check("Database/Employees")) {
				FileInputStream fis = new FileInputStream("Database/Employees");
				ObjectInputStream oin = new ObjectInputStream(fis);
				employees = (HashSet<Employee>) oin.readObject();
				
				oin.close();
				fis.close();
			}
			
			employees.add((Employee)user);
			fos = new FileOutputStream("Database/Employees");
			out = new ObjectOutputStream(fos);
			out.writeObject(employees);
		}else {
			HashSet<Student> students = new HashSet<Student>();
			if(check("Database/Students")) {
				FileInputStream fis = new FileInputStream("Database/Students");
				ObjectInputStream oin = new ObjectInputStream(fis);
				students = (HashSet<Student>) oin.readObject();
				
				oin.close();
				fis.close();
			}
			students.add((Student)user);
			fos = new FileOutputStream("Database/Students");
			out = new ObjectOutputStream(fos);
			out.writeObject(students);
		}
		
		out.close();
		fos.close();
	}
	
	public static void removeUser(User user) throws ClassNotFoundException, IOException {
		if(findUser(user.getUserName())) {
			FileInputStream fis = new FileInputStream("Database/Users");
			ObjectInputStream oin = new ObjectInputStream(fis);
			HashSet<User> users = (HashSet<User>) oin.readObject();
			
			users.remove(user);
			FileOutputStream fos = new FileOutputStream("Database/Users");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(users);
			
			oin.close();
			out.close();
			fis.close();
			fos.close();
		}
	}
	
	public static void viewLogFile(User user) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("Database/log"));
		String line = bf.readLine();
		while(!line.equals("")) {
			System.out.println(line);
		}
		
		bf.close();
	}
	
	public static Employee getEmployee(User user, Employee e) throws IOException, ClassNotFoundException {
		if(user instanceof Admin) {
			if(check("Database/Employees")) {
				FileInputStream fis = new FileInputStream("Database/Employees");
				ObjectInputStream oin = new ObjectInputStream(fis);
				HashSet<Employee> employees = (HashSet<Employee>) oin.readObject();
				for(User employee:employees) {
					if(employee.equals(e)) return e;
				}
				
				oin.close();
				fis.close();
			}
		}
		
		return null;
	}
	
	public static void viewEmployees(User user) throws ClassNotFoundException, IOException {
		if(user instanceof Admin) {
			if(check("Database/Employees")) {
				FileInputStream fis = new FileInputStream("Database/Employees");
				ObjectInputStream oin = new ObjectInputStream(fis);
				HashSet<Employee> employees = (HashSet<Employee>) oin.readObject();
				for(User employee:employees) System.out.println(employee);
				
				oin.close();
				fis.close();
			}
		}
	}
	
	public static void showOrders(Executor e) throws IOException, ClassNotFoundException{
		if(e instanceof Executor) {
			if(check("Database/Orders")) {
				FileInputStream fis = new FileInputStream("Database/Orders");
				ObjectInputStream oin = new ObjectInputStream(fis);
				HashSet<Order> orders = (HashSet<Order>) oin.readObject();
				for(Order order:orders) System.out.println(order);
				
				oin.close();
				fis.close();
			}
		}
	}
	
	public static void removeOrder(Executor e, Order o) throws IOException, ClassNotFoundException {
		if(e instanceof Executor) {
			if(check("Database/Orders")) {
				HashSet<Order> orders = new HashSet<Order>();
				FileInputStream fis = new FileInputStream("Database/Orders");
				ObjectInputStream oin = new ObjectInputStream(fis);
				orders = (HashSet<Order>) oin.readObject();
				orders.remove(o);
				FileOutputStream fos = new FileOutputStream("Database/Orders");
				ObjectOutputStream out = new ObjectOutputStream(fos);
				out.writeObject(orders);
				
				oin.close();
				out.close();
				fis.close();
				fos.close();
			}
		}
	}
	
	public static boolean findOrder(Executor e,Order o) throws IOException, ClassNotFoundException {
		if(e instanceof Executor) {
			if(check("Database/Orders")) {
				FileInputStream fis = new FileInputStream("Database/Orders");
				ObjectInputStream oin = new ObjectInputStream(fis);
				HashSet<Order> orders = (HashSet<Order>) oin.readObject();

				return orders.contains(o);
			}
		}
		return false;
	}
	
	public static void addNews(String message) throws IOException, ClassNotFoundException {
		Date date = new Date();
		TreeMap<Date, String> news = new TreeMap<Date, String>();
		if(check("Database/News")) {
			FileInputStream fis = new FileInputStream("Database/News");
			ObjectInputStream oin = new ObjectInputStream(fis);
			news = (TreeMap<Date, String>) oin.readObject();
			
			oin.close();
			fis.close();
		}
		
		news.put(date, message);
		FileOutputStream fos = new FileOutputStream("Database/News");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(news);
		
		out.close();
		fos.close();
	}
	
	public static void addRegistrateCourses(Course course, HashSet<Teacher> teachers) throws IOException, ClassNotFoundException {
		HashMap<Course, HashSet<Teacher>> registrate = new HashMap<Course, HashSet<Teacher>>();
		if(check("Database/CourseForRegistrate")) {
			FileInputStream fis = new FileInputStream("Database/CourseForRegistrate");
			ObjectInputStream oin = new ObjectInputStream(fis);
			registrate = (HashMap<Course, HashSet<Teacher>>) oin.readObject();
			
			oin.close();
			fis.close();
		}
		
		registrate.put(course, teachers);
		FileOutputStream fos = new FileOutputStream("Database/CourseForRegistrate");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(registrate);
		
		out.close();
		fos.close();
	}
	
	public static void viewInfoAboutEmployee(User u, Employee e) throws IOException, ClassNotFoundException {
		if(u instanceof Admin || u instanceof Manager) {
			if(check("Database/Employees")) {
				FileInputStream fis = new FileInputStream("Database/Employees");
				ObjectInputStream oin = new ObjectInputStream(fis);
				HashSet<Employee> employees = (HashSet<Employee>) oin.readObject();
				
				System.out.println(employees.contains(e)?e:"Not Found");
				
				oin.close();
				fis.close();
			}
		}
	}
	
	public static void viewInfoAboutStudent(Student s) throws IOException, ClassNotFoundException {
		if(check("Database/Students")) {
			FileInputStream fis = new FileInputStream("Database/Students");
			ObjectInputStream oin = new ObjectInputStream(fis);
			HashSet<Student> students = (HashSet<Student>) oin.readObject();
			for(Student student:students) System.out.println(student);
			
			oin.close();
			fis.close();
		}
	}
	
	public static void setCourseFiles(Teacher teacher, HashSet<CourseFile> courseFiles) throws ClassNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("Database/" + teacher.getUserName());
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(courseFiles);
		
		out.close();
		fos.close();
	}
	
	public static void createCourseFile(Teacher teacher) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter pw = new PrintWriter("Database/" + teacher.getUserName() + ".txt", "UTF-8");
		pw.close();
		pw = new PrintWriter("Database/" + teacher.getUserName() + "Courses" + ".txt", "UTF-8");
		pw.close();
		pw = new PrintWriter("Database/" + teacher.getUserName() + "Schedule" + ".txt", "UTF-8");
		pw.close();
	}
	
	public static void createTeacherFile(Teacher t, Course c) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("Database/" + t.getUserName() + c.getTitle());
		pw.close();
	}
	
	public static void viewInfoAboutStudent(Teacher t, Student s, Course c) throws IOException, ClassNotFoundException {
		if(check("Database/" + t.getUserName() + c.getTitle())) {
			FileInputStream fis = new FileInputStream("Database/" + t.getUserName() + c.getTitle());
			ObjectInputStream oin = new ObjectInputStream(fis);
			HashSet<Student> students = (HashSet<Student>) oin.readObject();
			System.out.println(students.contains(s)?s:"Not Found");
			
			oin.close();
			fis.close();
		}
	}
	
	public static void viewInfoAboutStudent(Teacher t, Course c) throws IOException, ClassNotFoundException {
		if(check("Database/" + t.getUserName() + c.getTitle())) {
			FileInputStream fis = new FileInputStream("Database/" + t.getUserName() + c.getTitle());
			ObjectInputStream oin = new ObjectInputStream(fis);
			HashSet<Student> students = (HashSet<Student>) oin.readObject();
			for(Student student:students) {
				System.out.println(student);
			}
			
			oin.close();
			fis.close();
		}
	}
	
	public static void putMark(Teacher t, Course c, Student s, Mark mark) throws IOException, ClassNotFoundException {
		HashSet<Student> students = new HashSet<Student>();
		if(check("Database/" + t.getUserName() + c.getTitle())) {
			FileInputStream fis = new FileInputStream("Database/" + t.getUserName() + c.getTitle());
			ObjectInputStream oin = new ObjectInputStream(fis);
			students = (HashSet<Student>) oin.readObject();
			for(Student student:students) {
				if(student.equals(s)) {
					s.setMark(c, mark);
				}
			}
			
			oin.close();
			fis.close();
		}
		
		FileOutputStream fos = new FileOutputStream("Database/" + t.getUserName() + c.getTitle());
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(students);
		
		out.close();
		fos.close();
	}
	
	public static void putMarks(Teacher teacher, Course course, ArrayList<Mark> marks) throws IOException, ClassNotFoundException {
		HashSet<Student> students = new HashSet<Student>();
		if(check("Database/" + teacher.getUserName() + course.getTitle())) {
			FileInputStream fis = new FileInputStream("Database/" + teacher.getUserName() + course.getTitle());
			ObjectInputStream oin = new ObjectInputStream(fis);
			students = (HashSet<Student>) oin.readObject();
			Iterator it = marks.iterator();
			for(Student student:students) {
				student.setMark(course, (Mark)it.next());
			}
			
			oin.close();
			fis.close();
		}
		
		FileOutputStream fos = new FileOutputStream("Database/" + teacher.getUserName() + course.getTitle());
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(students);
		
		out.close();
		fos.close();
	}
	
	public static HashSet<CourseFile> getCourseFiles(Teacher teacher) throws ClassNotFoundException, IOException {
		HashSet<CourseFile> courseFiles = new HashSet<CourseFile>();
		if(check("Database/" + teacher.getUserName())) {
			FileInputStream fis = new FileInputStream("Database/" + teacher.getUserName());
			ObjectInputStream oin = new ObjectInputStream(fis);
			courseFiles = (HashSet<CourseFile>) oin.readObject();
		}
		
		return courseFiles;
	}
	
	public static void viewCourses(Teacher teacher) throws IOException, ClassNotFoundException {
		if(check("Database/" + teacher.getUserName())) {
			FileInputStream fis = new FileInputStream("Database/" + teacher.getUserName());
			ObjectInputStream oin = new ObjectInputStream(fis);
			HashSet<Course> courses = (HashSet<Course>) oin.readObject();
			for(Course course:courses) System.out.println(course);
			
			oin.close();
			fis.close();
		}
	}
	
	public static void addCourse(Teacher teacher, Course course) throws IOException, ClassNotFoundException {
		HashSet<Course> courses = new HashSet<Course>();
		if(check("Database/" + teacher.getUserName())) {
			FileInputStream fis = new FileInputStream("Database/" + teacher.getUserName());
			ObjectInputStream oin = new ObjectInputStream(fis);
			courses = (HashSet<Course>) oin.readObject();
			
			oin.close();
			fis.close();
		}
		
		courses.add(course);
		FileOutputStream fos = new FileOutputStream("Database/" + teacher.getUserName());
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(courses);
		
		out.close();
		fos.close();
	}
	
	public static void removeCourse(Teacher teacher, Course course) throws IOException, ClassNotFoundException {
		HashSet<Course> courses = new HashSet<Course>();
		if(check("Database/" + teacher.getUserName())) {
			FileInputStream fis = new FileInputStream("Database/" + teacher.getUserName());
			ObjectInputStream oin = new ObjectInputStream(fis);
			courses = (HashSet<Course>) oin.readObject();
			
			oin.close();
			fis.close();
		}
		
		if(courses.contains(course)) {
			courses.remove(course);
			FileOutputStream fos = new FileOutputStream("Database/" + teacher.getUserName());
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(courses);
			
			out.close();
			fos.close();
		}
	}
	
	public static void setTime(Teacher teacher, Course course, DayAndTime dat) throws IOException, ClassNotFoundException {
		HashMap<DayAndTime, Course> schedule = new HashMap<DayAndTime, Course>();
		if(check("Database/" + teacher.getUserName() + "Schedule")) {
			FileInputStream fis = new FileInputStream("Database/" + teacher.getUserName() + "Schedule");
			ObjectInputStream oin = new ObjectInputStream(fis);
			schedule = (HashMap<DayAndTime, Course>)oin.readObject();
			
			oin.close();
			fis.close();
		}
		
		schedule.put(dat, course);
		FileOutputStream fos = new FileOutputStream("Database/" + teacher.getUserName() + "Schedule");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(schedule);
		
		out.close();
		fos.close();
	}
	
	public static void addAbsence(Teacher t, Student s, Course c) throws IOException, ClassNotFoundException {
		HashSet<Student> students = new HashSet<Student>();
		if(check("")) {
			FileInputStream fis = new FileInputStream("Database/" + t.getUserName() + c.getTitle());
			ObjectInputStream oin = new ObjectInputStream(fis);
			students = (HashSet<Student>) oin.readObject();
			for(Student student: students) {
				if(student.equals(s)) {
					s.getAttendance().addAbsence(c);
					break;
				}
			}
			
			oin.close();
			fis.close();
			
			FileOutputStream fos = new FileOutputStream("Database/" + t.getUserName() + c.getTitle());
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(students);
			
			out.close();
			fos.close();
		}
	}
	
	public static boolean check(String path) {
		File file = new File(path);
		if(file.length() == 0) return false;
		return true;
	}
}
