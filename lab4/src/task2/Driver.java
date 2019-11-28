package task2;

import java.io.*;
import java.util.Vector;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Course> cc = new Vector<Course>();
		Textbook tb = new Textbook("1234", "OOP", "Pakita");
		Instructor in = new Instructor("Pakita", "Shamoi", "FIT", "hi@g");
		Course ctest = new Course("oop", tb, in);
		cc.add(ctest);
		Vector<Textbook> tt = new Vector<Textbook>();
		Vector<Instructor> ii = new Vector<Instructor>();
		try {
			
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		while (!input.equals("q"))
		{
			System.out.println("Choose the mode to run the program in aproriate way, write u or a : ");
			if ("a".equals(br.readLine()))
			{
				String username = br.readLine();
				String password = br.readLine();
				BufferedReader br1 = new BufferedReader(new FileReader("admin.txt"));
				String line = br1.readLine();
				
				while (line != null)
				{
					if (username.equals(line))
					{
						line = br1.readLine();
						if (password.equals(line)){
							
							System.out.println("t for TextBook, c for Course, i for Instructor: ");
							if ("t".equals(br.readLine()))
							{
								String isbn = br.readLine();								
								String title = br.readLine();								
								String author = br.readLine();
								
								
								Textbook t = new Textbook(isbn, title, author);
								tt.add(t);
								System.out.println("added");
							}else if ("c".equals(br.readLine()))
							{
								String coursetitle = br.readLine();
								Textbook t1 = null;
								for(Textbook value : tt) {
									if(br.readLine().equals(value.title))
										t1 = new Textbook(value.isbn, value.title, value.authors);
								}
								Instructor i1 = null;
								for(Instructor value : ii) {
									if(br.readLine().equals(value.firstName))
										i1 = new Instructor(value.firstName, value.lastName, value.department, value.email);
								}
								
								Course c = new Course(coursetitle, t1, i1);
								
							}else if ("i".equals(br.readLine()))
							{
								String fn = br.readLine();
								String ln = br.readLine();
								String department = br.readLine();
								String email = br.readLine();
								
								Instructor i = new Instructor(fn, ln, department, email);
								ii.add(i);
							}
						}else 
							System.out.println("password are incorrect!");
					}
				}
				
			} if ("u".equals(br.readLine()))
			{
				System.out.println("View the list (v) OR Display the info (d) :");
				if ("v".equals(br.readLine()))
				{
					for (Course value : cc)
					{
						System.out.println(value.getCourseTitle());
					}
				}
				else if ("d".equals(br.readLine()))
				{
					for (Course value : cc)
					{
						if (br.readLine().equals(value.getCourseTitle()))
						{
							System.out.println(value.toString());
						}else 
							System.out.println("No such course");
						}			
					}
				}
			}
		}
		catch(IOException e)
		{
			System.out.println("Cannot read!");
		}
	}
}