package Serialization;
import java.io.*;
public class Deserializing {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("book.out");
		ObjectInputStream oin = new ObjectInputStream(fis);
		Book b = (Book) oin.readObject();
		System.out.println(b);

	}

}
