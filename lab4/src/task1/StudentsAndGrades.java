package task1;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class StudentsAndGrades {
	static char getCharScore(int value, int maxi) {
	  if (value >= maxi -10 && value <= 100)
	   return 'A';
	  if (value >= maxi -20)
	   return 'B';
	  if (value >= maxi-30)
	   return 'C';
	  if (value >= maxi-40)
	   return 'D';
	   else 
	    return 'F';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> scores = new HashMap<String, Integer>();
		try {
	           BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
	                    
	           String line = br.readLine();
	           int score = 0;
	           // while not end of file… keep reading and displaying lines
	           while (line != null) {	
	        	   
	        	   StringTokenizer st = new StringTokenizer(line);  
	        	   String name = st.nextToken();
		           String surname = st.nextToken();
		           String sc = st.nextToken();
		           score = Integer.parseInt(sc);
		           line = br.readLine();
	               scores.put(name + " " + surname, score);	               
	           }	   
	           br.close();
	           String answer = "";
	           int maxi = Collections.max(scores.values());
	           char ans = 0;
	           BufferedWriter bw = new BufferedWriter(new FileWriter("grades.txt", true));
	        
	           for(Entry<String, Integer> entry : scores.entrySet()) {
	        		   ans = getCharScore(entry.getValue(), maxi);
	        		   answer = entry.getKey() + " -- " + Character.toString(ans);
	        		   bw.write(answer + "   \n  ");
	           }
	           
	           
	           
	           bw.close();
//	           for (String i : scores.keySet()) {
//	        	   System.out.println(i + " - " + scores.get(i));
//	        	 }
	           System.out.println("Wrote in file");
	       } catch(FileNotFoundException fe) {
	               System.out.println("File not found");
	       } catch(IOException ioe) {
	               System.out.println("Can’t read from file");
	       }
	}

}


