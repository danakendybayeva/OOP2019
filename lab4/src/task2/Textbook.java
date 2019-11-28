package task2;

import java.io.Serializable;

public class Textbook implements Serializable{
	String isbn, title, authors;
	Textbook(String isbn, String title, String authors){
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
	}
	void setTitle(String title) {
		this.title = title;
	}
	String getTitle() {
		return title;
	}
	void setISBN(String isbn) {
		this.isbn = isbn;
	}
	String getISBN() {
		return isbn;
	}
	void setAuthors(String authors) {
		this.authors = authors;
	}
	String getAuthors() {
		return authors;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Title is" + title + ", author(s) " + authors + ", ISBN is " + isbn;
	}
	@Override
	public boolean equals(Object obj) {
	        if(obj != null && this.getClass() == obj.getClass()){
	            Textbook temp = (Textbook) obj;
	            return (temp.title.equals(title));
	        }
	        return false;
	    
	}
}
