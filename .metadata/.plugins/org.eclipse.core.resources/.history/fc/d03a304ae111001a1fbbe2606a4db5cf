package myPart;

import java.util.*;

public class Schedule {
	private SortedMap<Days, SortedMap<Time, Course>> schedule;

	public SortedMap<Days, SortedMap<Time, Course>> getSchedule() {
		return schedule;
	}

	public void setSchedule(Course c, Teacher t) {
		if(c.getTeacher() == t) {
			SortedMap<Time, Course> tc = null;
			tc.put(c.getT(), c);
			schedule.put(c.getD(), tc);
		}
	}
	
	
}
