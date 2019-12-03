package Package_1;

import java.io.IOException;
import java.lang.*;

/**
 */
public abstract class Employee extends User {
    private static int numOfEmpoyee = 0;
    private int employeeId;
    private int salary;
    
    {
    	numOfEmpoyee += 1;
    	employeeId = numOfEmpoyee;
    }
    
    public Employee(String userName, String password, String firstName, String lastName, int salary) {
    	super(userName, password, firstName, lastName);
    	this.salary = salary;
    }
    
    public int getEmployeeId() {
    	return employeeId;
    }

    /**
     * sends order from any employee to IT specialist
     * @param message 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public static void sendOrder(Order o) throws IOException, ClassNotFoundException {
    	Singletone.addOrder(o);
    }
    
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false;
		
		Employee e = (Employee) obj;
		if(e.employeeId == employeeId) return true;
		
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmployee [employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if(employeeId > e.getEmployeeId()) return 1;
		if(employeeId<e.getEmployeeId()) return -1;
		return 0;
	}
}

