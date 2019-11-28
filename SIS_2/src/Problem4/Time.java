package Problem4;

public class Time implements Comparable{
	int hour;
	int minute;
	int second;
	
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	String universal() {
		String s = "Universal " + hour + ":" + minute + ":" + second;
		return s;
	}
	String standart() {
		String day;
		if(hour >= 1 && hour <= 12) day = "AM";
		else day = "PM";
		if(hour > 12) hour -= 12;
		else hour = hour;
		String s = "Standart " + hour + ":" + minute + ":" + second + " " + day;
		return s;
	}
	void showBoth() {
		universal();
		standart();		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Time other = (Time) arg0;
		if(hour>other.hour) return 1;
		if(hour<other.hour) return -1;
		if(minute>other.minute) return 1;
		if(minute<other.minute) return -1;
		return 0;
	}	
}
