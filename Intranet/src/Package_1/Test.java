package Package_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ArrayList<DayAndTime> ar = new ArrayList<DayAndTime>();
		ar.add(new DayAndTime(Days.MON, Time.SIXTEEN));
		ar.add(new DayAndTime(Days.FRI, Time.ELEVEN));
		ar.add(new DayAndTime(Days.THU, Time.FIFTEEN));
		ar.add(new DayAndTime(Days.MON, Time.EIGHT));
		ar.add(new DayAndTime(Days.WED, Time.EIGHT));
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
	}

}
