package Package_1;

import java.io.IOException;
import java.util.List;

import Package_1.*;

/**
 */
public class Executor extends Employee {
    /**
     */
    private List<Order> orders;
    
    public Executor(String userName, String password, String firstName, String lastName, int salary) {
    	super(userName, password, firstName, lastName, salary);
    }

    /**
     * shows the list of orders that were sent to the executor
     */
    public void viewOrders() {
    	for(Order o:orders){
    		System.out.println(o);
    	}
    }

    /**
     * changes the status of order from new to accepted
     * @param order 
     */
    public void acceptOrder(Order order) {
    	orders.add(order);
    }

    /**
     * changes the status of order from new to rejected
     * @param order 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void rejectOrder(Order order) throws ClassNotFoundException, IOException {
    	Singletone.removeOrder(this, order);
    }

    /**
     * searches for some order
     * @param order 
     * @return 
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public boolean findOrder(Order order) throws ClassNotFoundException, IOException {    	
        return Singletone.findOrder(this, order);
    }
    
    public String toString() {
    	return super.toString() + "\nNumber of Orders " + orders.size();
    }
}

