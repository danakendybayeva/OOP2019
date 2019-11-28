package Serialization;
import java.io.*;

public class SerializingBookObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("book.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Book b = new Book(220,"Ann Karenina");
		oos.writeObject(b);
		oos.flush();
		oos.close();
		
	}

}
