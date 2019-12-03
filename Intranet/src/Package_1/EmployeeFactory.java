package Package_1;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class EmployeeFactory {
	public static Employee createEmployee(String userName, String password, String firstName, String lastName, int salary, String type) throws FileNotFoundException, UnsupportedEncodingException {
		if(type.equals("Executor")) {
			return new Executor(userName, password, firstName, lastName, salary);
		}if(type.equals("Admin")) {
			return new Admin(userName, password, firstName, lastName, salary);
		}if(type.equals("Teacher")) {
			return new Teacher(userName, password, firstName, lastName, salary, Degree.BACHELOR);
		}
		
		return null;
	}
}
