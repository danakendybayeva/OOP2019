package Package_1;

public class DayAndTime implements Comparable{
	private Days day;
	private Time hour;
	public DayAndTime(Days day, Time hour) {
		this.day = day;
		this.hour = hour;
	}
	
	public Days getDay() {
		return day;
	}
	
	public Time getHour() {
		return hour;
	}
	
	public void setDay(Days day) {
		this.day = day;
	}
	
	public void setHour(Time hour) {
		this.hour = hour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((hour == null) ? 0 : hour.hashCode());
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
		DayAndTime other = (DayAndTime) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (!hour.equals(other.hour))
			return false;
		return true;
	}
	
	public String toString() {
		return String.format("%s %s", day, hour);
	}
	
	public int compareTo(Object o) {
		DayAndTime dat = (DayAndTime) o;
		if(day.equals(dat.getDay())) {
			return hour.compareTo(dat.getHour());
		}
		
		return day.compareTo(dat.getDay());
	}
}