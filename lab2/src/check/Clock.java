package check;

public class Clock {
	
		public static void main(String[] args) {
		  Time t1 = new Time(22, 17, 4);
		  Time t2 = new Time(4, 57, 58);
		  System.out.println(t1.toUniverse());
		  System.out.println(t1.toStandard());
		  System.out.println(t1.sumT(t2));
		} 
	}
		class Time {
			 public int hour;
			 public int minute;
			 public int second;
			 String str = "";
			 String strzero = "0";
			 
			 public Time (int hour, int minute, int second){
			  this.hour = hour;
			  this.minute = minute;
			  this.second = second;
			 }
		
			 public String zero(String input){
			  if (input.length()== 1)  
				  return strzero + input;
			  else return input;
			 }
		 
			 public String toUniverse() {
				 if (hour < 24 && minute < 60 && second < 60)
						return zero(Integer.toString(hour)) + ":" + 
						 	   zero(Integer.toString(minute)) + ":" + 
						 	   zero(Integer.toString(second));
				 else return "invalid";
			 }
			 
			 public String toStandard() { 
				 if (hour < 24 && minute < 60 && second < 60)
					 {
						 if (hour > 12)
					 {
					     return zero(Integer.toString(hour - 12)) + ":" + 
					    		zero(Integer.toString(minute)) + ":" + 
					    		zero(Integer.toString(second))+ " PM";
					 }
						 else return zero(Integer.toString(hour)) + ":" + 
						 			 zero(Integer.toString(minute)) + ":" + 
						 			 zero(Integer.toString(second)) + " AM";
					 } 
				 else return "Invalid";
			 }
			 
			 public String sumT(Time t)
			 {
				  int sumsec = t.second + second;
				  int summin = t.minute + minute;
				  int sumh = t.hour + hour;
				  int remainder = 0;
				  
				  if (sumsec > 59) {
					   sumsec %= 60;
					   summin += 1;
				   
				  if (summin > 59) {
					   summin %= 60;
					   sumh += 1;
				
				  if (sumh> 23)  sumh %= 24;
				  	}
				  } else if (summin > 59) {
					if (summin > 59)  {
					    summin %= 60;
					    sumh += 1;
					    
					if (sumh > 23)  sumh -= 24;
					    
				  } else if (sumh > 23)  sumh -= 24;
					
				  } else if (sumh > 23)  sumh %= 24;
				  
				  return (zero(Integer.toString(sumh))+ ":" + 
						  zero(Integer.toString(summin)) + ":" + 
						  zero(Integer.toString(sumsec)));
			 	  }
		}