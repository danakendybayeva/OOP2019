package Package_1;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//a.addUser(new Student("nyasha", "qweasdzxc123", "Nurbergen", "Lalala", "18BD110937", 2018, Faculty.FIT));
		try {
			User nurik = User.logIn("nyasha", "qweasdzxc13");
			System.out.println(nurik);
		}catch(IncorrectPasswordOrLoginException ex) {
			System.out.println(ex.getMessage());
		}
		//a.sendOrder(new Order(a, "GG"));
	}

}
