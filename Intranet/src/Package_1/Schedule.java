package Package_1;

import java.io.Serializable;
import java.util.*;

public class Schedule implements Serializable{
	private SortedMap<DayAndTime, Course> schedule;

	public SortedMap<DayAndTime, Course> getSchedule() {
		return schedule;
	}

	public void setSchedule(Course c, Teacher t) {
		if(c.getTeacher() == t) {
			schedule.put(new DayAndTime(c.getDay(), c.getTime()), c);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = null;
		for(DayAndTime key: schedule.keySet()) {
			s += key + " - " + schedule.get(key) + "\n";
		}
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		return true;
	}
	
}
