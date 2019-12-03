package Package_1;

import java.io.Serializable;
import java.lang.*;
import java.util.HashSet;
import java.util.List;

/**
 */
public class Course implements Serializable, Comparable, Cloneable{
    private String title;
    private Teacher teacher;
    private int credit;
    private HashSet<Course> prerequisite;
    private HashSet<Faculty> faculty;
    private int semestrOfStudy;
    private Time time;
    private Days day;
    
    public Course(String title, Teacher teacher, HashSet<Faculty> faculty, int semestrOfStudy, Days day, Time time) {
    	this.title = title;
    	this.teacher = teacher;
    	this.faculty = faculty;
    	this.semestrOfStudy = semestrOfStudy;
    	this.time=time;
    	this.day = day;
    }
    
    public Course(String title, Teacher teacher, HashSet<Faculty> faculty, int semestrOfStudy, Days day, Time time, HashSet<Course> prerequisite) {
    	this(title, teacher, faculty, semestrOfStudy, day,  time);
    	this.prerequisite = prerequisite;
    }
    
    public void setTitle(String title) {
    	this.title =  title;
    }
    
    public String getTitle() {
    	return title;
    }
    
    public void setDay(Days day) {
    	this.day = day;
    }
    
    public Days getDay() {
    	return day;
    }
    
    public void setTime(Time time) {
    	this.time = time;
    }
    
    public Time getTime() {
    	return time;
    }
    
    public Teacher getTeacher() {
    	return teacher;
    }
    
    public void setSemestrOfStudy(int semestrOfStudy) {
    	this.semestrOfStudy = semestrOfStudy;
    }
    
    public int getSemestrOfStudy() {
    	return semestrOfStudy;
    }
    
    public void addFaculty(Faculty faculty) {
    	if(!this.faculty.contains(faculty)) {
    		this.faculty.add(faculty);
    	}
    }
    
    public void setFaculty(HashSet<Faculty> faculty) {
    	this.faculty = faculty;
    }
    
    public void setCredit(int credit){
    	if(credit>0) {
    		this.credit = credit;
    	}
    }
    
    public int getCredit() {
    	return credit;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (credit != other.credit)
			return false;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (prerequisite == null) {
			if (other.prerequisite != null)
				return false;
		} else if (!prerequisite.equals(other.prerequisite))
			return false;
		if (semestrOfStudy != other.semestrOfStudy)
			return false;
		if (teacher == null) {
			if (other.teacher != null)
				return false;
		} else if (!teacher.equals(other.teacher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", teacher=" + teacher + ", credit=" + credit + ", prerequisite="
				+ prerequisite + ", faculty=" + faculty + ", semestrOfStudy="
				+ semestrOfStudy + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Course other = (Course) arg0;
		return title.compareTo(other.title);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Course cloned = (Course)super.clone();
		cloned.teacher = (Teacher)teacher.clone();
		cloned.prerequisite = (HashSet<Course>) prerequisite.clone();
		cloned.faculty = (HashSet<Faculty>) faculty.clone();
		return cloned;
	}
	
	
}

