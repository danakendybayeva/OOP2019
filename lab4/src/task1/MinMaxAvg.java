package task1;

import java.util.*;
import java.io.*;

public class MinMaxAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		  {
			BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
			ArrayList<Integer> all = new ArrayList<Integer>();
			int average = 0;
		    int max = 0;
		    int min = 0;
		    int sum = 0;
		    int count = 0;
		    int score;
		    String line = br.readLine();
		  
		  while (line != null) {
			  StringTokenizer tokens = new StringTokenizer(line);
			  @SuppressWarnings("unused")
			  String firstname = tokens.nextToken();
			  @SuppressWarnings("unused")
			  String lastname = tokens.nextToken();
			  String scorechar = tokens.nextToken();
			  score = Integer.parseInt(scorechar);
			  line =br.readLine();
			  all.add(score);
		  }
		  br.close();
		  int maxo = Integer.MIN_VALUE;
		  int mino = Integer.MAX_VALUE;
		    
		  for (int i = 0; i < all.size(); ++i)
			  if (all.get(i) < mino)
				  mino = all.get(i);
		  for (int i = 0; i < all.size(); ++i)		   
			  if (all.get(i) > maxo) 
				  maxo = all.get(i);
		  for (int i = 0; i < all.size(); ++i) {
			  count++;
			  max = maxo;
			  min = mino;
			  sum += all.get(i);
			  average = sum / count;
		  }		  
		  String str = "Max -- " + max + " Min -- " + min + " Average -- " + average + "   ";		    
		  BufferedWriter bw = new BufferedWriter(new FileWriter("grades.txt", true));
		  bw.write(str + "\n");
		  
		  bw.close();		    
		  }
		  catch (FileNotFoundException fe) {
		    System.out.println("File not found");
		  }
		  catch (IOException io) {
		    System.out.println("Cannot read");
		  }
	}
}
