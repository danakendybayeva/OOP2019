package myPart;

public class UserFactory {
	
	public User createUser(String userType) {
		User newUser = null;
		String[] s = userType.split(" "); //s[0] = type, s[1] = name, s[2] = surname
		if(s[0].equals("S")) {//student
			return new Student(s[1], s[2]);
		} else if(s[0].equals("T")) {//teacher
			return new Teacher(s[1], s[2]);
		} else if(s[0].equals("E")) {//executor
			return new Executor(s[1], s[2]);
		} else if(s[0].equals("M")) {//manager
			return new Manager(s[1], s[2]);
		} else if(s[0].equals("A")) {//admin
			return new Admin(s[1], s[2]);
		} return null;
	}
}
