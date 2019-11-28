package streams_io;
import java.io.*;
import java.util.*;
class RandomAccessFileExample {
	public static void main(String args[]) throws Exception {
		RandomAccessFile raf1 = null;
		RandomAccessFile raf2 = null;
		long filesize = -1;
		byte[] buffer1;
		try {
			raf1 = new RandomAccessFile("a.in", "r"); // it is read-only
			raf2 = new RandomAccessFile("a.out", "rw");// it is readable and writable
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(100);
		}

		try {
			filesize = raf1.length();
			int bufsize = (int)filesize/2;
			buffer1 = new byte[bufsize];
			raf1.readFully(buffer1, 0, bufsize);	// store half of a text in buffer1   
			raf2.write(buffer1, 0, bufsize);	//write the content of buffer1 to a.out
			System.out.println(raf1.length());
			raf2.seek(4); // move cursor position to 4
			raf2.writeBytes("Hello! We've copied half of a file and now we override it with this long writing!");
			System.out.println(raf2.getFilePointer());
		} catch (IOException e) {
			System.out.println("IO error occurred!");
			System.exit(200);
		}
	}
}
