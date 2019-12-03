package Package_1;

import java.io.Serializable;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.*;
import Package_1.*;

/**
 */
public class Order implements Serializable{
    private String message;
    private Status status;
    private Employee sender;
    private Date date;
    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    {
    	date = new Date();
    	status = Status.NEW;
    }
    
    public Order(Employee sender, String message) {
    	this.sender = sender;
    	this.message = message;
    }
    
    public void changeStatus(Executor e, Status newStatus) {
    	status = newStatus;
    }
    
    public String toString() {
    	return String.format("Sender: %s\nMessage: %s\nDate: %s\nStatus: %s", sender.getLastName()+ " " + sender.getFirstName(), 
    			message, date, status);
    }
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (sender == null) {
			if (other.sender != null)
				return false;
		} else if (!sender.equals(other.sender))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
    
}

