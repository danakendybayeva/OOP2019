package Package_1;

import java.io.IOException;
import java.io.Serializable;
import java.lang.*;
import Package_1.*;

public abstract class User implements Serializable, Cloneable, Comparable{
    private String userName;
    private String password;
    private String firstName;
	private String lastName;
    private boolean isLogIn;
    private static int numOfUsers = 0;
    private int userId;
    
    {
    	numOfUsers += 1;
    	userId = numOfUsers;
    	isLogIn = false;
    }
    
    public User(String userName, String password, String firstName, String lastName){
    	this.userName = userName;
    	this.password = hashPassword(password);
    	this.firstName = firstName;
    	this.lastName = lastName;
    }

    /**
     * loging to the user system, checks the username and password
     * @param password 
     * @param userName 
     * @return Return user object if he login to system
     * @throws IOException 
     * @throws ClassNotFoundException 
     * @throws IncorrectPasswordOrLoginException 
     */
    public static User logIn(String userName, String password) throws ClassNotFoundException, IOException, IncorrectPasswordOrLoginException {
        User user = Singletone.getUser(userName);
        if(user.password.equals(hashPassword(password))) return user;
        else {
        	throw new IncorrectPasswordOrLoginException("Incorrect Password Or Login!");
        }
    }

    /**
     * exits the user system
     */
    public User logOut() {
    	return null;
    }

    /**
     * shows to user list of all news
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public void viewNews() throws ClassNotFoundException, IOException {
    	Singletone.showNews();
    }
    
    private static String hashPassword(String password) {
		String hashPass = "";
		for(int i = 0; i < password.length(); ++i) {
			hashPass += (char)(((int)password.charAt(i)) + 3);
		}
		
		return hashPass;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (isLogIn != other.isLogIn)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
    public String getUserName() {
		return userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public static int getNumOfUsers() {
		return numOfUsers;
	}

	public int getUserId() {
		return userId;
	}

	public void setPassword(String newPassword) {
		this.password = hashPassword(newPassword);
	}
	
	public String toString() {
		return String.format("First Name: %s\nLast Name: %s\nStudent ID: %d", firstName, lastName, userId);
	}
	
	public int CompareTo(Object o) {
		User u = (User) o;
		if(userId > u.getUserId()) return 1;
		if(userId<u.getUserId()) return -1;
		return 0;
	}
}

