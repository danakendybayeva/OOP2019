package streams_io;
import java.util.*;
public class StringTokenizerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 StringTokenizer st = new StringTokenizer("A*B*Cccc", "*");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }

	     System.out.println();
	     StringTokenizer st2 = new StringTokenizer("A*B*Cc|cc", "*|");
	     while (st2.hasMoreTokens()) {
	         System.out.println(st2.nextToken());
	     }

	}

}
