package myPart;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		UserFactory userFact = new UserFactory();
		User user = null;
		Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        user =  userFact.createUser(s); 
        if(user != null)
        	System.out.println(user.toString());
	}
	

}
