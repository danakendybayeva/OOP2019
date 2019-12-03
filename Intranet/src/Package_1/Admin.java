package Package_1;

import java.io.IOException;
import java.io.Serializable;

import Package_1.*;

/**
 */
public class Admin extends Employee{
	
	public Admin(String userName, String password, String firstName, String lastName, int salary) {
		super(userName, password, firstName, lastName, salary);
	}
	
    /**
     * creates a new user
     * @param user 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void addUser(User user) throws ClassNotFoundException, IOException {
    	if(!Singletone.findUser(user.getUserName())) {
    		Singletone.addUser(user);
    	}
    }
    
    public Employee getEmployee(String userName, String password, String firstName, String lastName, int salary, String type) throws ClassNotFoundException, IOException {
    	Employee e = EmployeeFactory.createEmployee(userName, password, firstName, lastName, salary, type);
    	addUser(e);
    	
    	return e;
    }
    /**
     * deletes user
     * @param user 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void removeUser(User user) throws ClassNotFoundException, IOException {
    	Singletone.removeUser(user);
    }

    /**
     * change data of user
     * @param user 
     */
    public void manageUser(User user) {
    }

    /**
     * shows the actions that users did, like added course, sent order, etc.
     * @throws IOException 
     */
    public void viewLogFile() throws IOException {
    	Singletone.viewLogFile(this);
    }

    /**
     * shows information about employee
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void viewInfo(Employee e) throws ClassNotFoundException, IOException {
    	System.out.println(Singletone.getEmployee(this, e));
    }
    
    public void viewInfoAboutEmployees() throws ClassNotFoundException, IOException {
    	Singletone.viewEmployees(this);
    }
}

