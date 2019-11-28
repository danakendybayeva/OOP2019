package task2;

public class Instructor {
	String firstName, lastName, department, email;
	Instructor(String firstName, String lastName, String department, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = email;
	}
	void setFN(String firstName) {
		this.firstName = firstName;
	}
	String getFN() {
		return firstName;
	}
	void setLN(String lastname) {
		this.lastName = lastname;
	}
	String getLN() {
		return lastName;
	}
	void setDepartment(String department) {
		this.department = department;
	}
	String getDepartment() {
		return department;
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName + " " + lastName + " Department is " + department + " Email is " + email;
	}
	
	@Override
	public boolean equals(Object obj) {
        if(obj != null && this.getClass() == obj.getClass()){
            Instructor temp = (Instructor) obj;
            return temp.firstName.equals(firstName);
        }
        return false;
	    
	}
}
