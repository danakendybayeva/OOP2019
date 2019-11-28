package sis;
import java.util.*;

public class Problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(Gender.B);
		DragonLaunch d1 = new DragonLaunch(p1);
		Person p2 = new Person(Gender.B);
		DragonLaunch d2 = new DragonLaunch(p2);
		Person p3 = new Person(Gender.B);
		DragonLaunch d3 = new DragonLaunch(p3);
		Person p4 = new Person(Gender.G);		
		DragonLaunch d4 = new DragonLaunch(p4);
		d1.kidnap();
		d2.kidnap();
		d3.kidnap();
		d4.kidnap();
		
		DragonLaunch d = new DragonLaunch();
		d.showVector();
	}

}	
	enum Gender{
		B,
		G
	}

	class DragonLaunch{
		Person p = new Person(Gender.B);
		Vector<Person> kidnapped = new Vector<Person>();
		
		public DragonLaunch() {
			
		}
		public DragonLaunch(Person p) {
			this.p = p;
		}
		
		public void showVector() {
			System.out.println(kidnapped);
		}
		
		public void kidnap() {
			kidnapped.add(p);
		}
		public boolean equalOrNot(Gender g1, Gender g2) {
			if (g1.equals(g2)) return true;
			else return false;
		}
		
		
		public boolean willDragonEatOrNot(Vector kidnapped) {
			Stack<Person> st = null;
			for(int i = 0; i < kidnapped.size(); ++i){
		        if(kidnapped.get(i) == "B"){
		            st.push(p);
		        }else  if(kidnapped.get(i) == "G"){
		            if(st.size() > 0){
		                st.pop();
		            }else   return true;	            
		        }
		    }
	
		    if(st.size() != 0)  return true;
		    
			return false;
		}
		
		
	}

	class Person{
		Gender g;
		
		public Person(Gender g) {
			this.g = g;
		}
		
		
		public String toString() {
			return null;
			
		}
	}
