package Serialization;
import java.io.Serializable;
import java.util.*;
public class Book implements Serializable{
	int numberOfPages=0;
	private String title="No title";
	Date publishDate = new Date();
	public Book(int num,String title){
		numberOfPages = num;
		this.title = title;
	}
	public void settitle(String title){
		this.title = title;
	}
	public String gettitle(){
		return title;
	}
	public String toString(){
		return title+" ,"+numberOfPages+" pages, published: "+publishDate;
	}
}
