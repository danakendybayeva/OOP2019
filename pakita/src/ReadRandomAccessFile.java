package streams_io;
import java.io.*;

public class ReadRandomAccessFile{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter File name : ");
		String str = in.readLine();
		File file = new File(str);
		if(!file.exists())
		{
			System.out.println("File does not exist.");
			System.exit(0);
		}
		try{
			//Open the file for both reading and writing
			RandomAccessFile rand = new RandomAccessFile(file,"rw"); 
			//rand.writeBytes("La-la-la");
			int i= (int)rand.length();
			System.out.println("Length: " + i);
   			rand.seek(0);	//Seek to start point of file
			for(int ct = 0; ct < i; ct++){
				byte b = rand.readByte();
				System.out.print((char)b); //read the character
			}
			rand.close();
		}
			catch(IOException e)
		{
		System.out.println(e.getMessage());
		}
	}
}
