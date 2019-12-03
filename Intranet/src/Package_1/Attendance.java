package Package_1;

import java.util.HashMap;

public class Attendance {

	private HashMap<Course, Integer> numOfAbsences;
	private HashMap<Course, Integer> numOfDelays;
	
	public HashMap<Course, Integer> getNumOfAbsences() {
		return numOfAbsences;
	}
	
	public HashMap<Course, Integer> getNumOfDelays() {
		return numOfDelays;
	}
	
	public void addAbsence(Course c) {
		int n = numOfAbsences.get(c);
		numOfAbsences.replace(c, n++);			
	}
	
	public void addDelay(Course c) {
		int n = numOfDelays.get(c);
		numOfDelays.replace(c, n++);
	}
}