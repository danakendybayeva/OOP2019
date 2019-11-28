package lab3;

import java.lang.*;

public class Task4 {

	public static void main(String[] args) {
		Piece Rook = new Rock('e', 1, 'd', 6);
		System.out.println(Rook.isMoveLegal(Rook.a, Rook.b, Rook.a1, Rook.b1));
		Piece Q = new Queen('a', 1, 'c', 3);
		System.out.println(Q.isMoveLegal(Q.a, Q.b, Q.a1, Q.b1));
	}

}

abstract class Piece {
	 char a;
	 int b;
	 char a1;
	 int b1;
	 public Piece(char a,int b,char a1,int b1)
	 {
		  this.a = a;
		  this.b = b;
		  this.a1 = a1;
		  this.b1 = b1;
	 }
	 public abstract boolean isMoveLegal(char a,  int b, char a1, int b1);
}

class King extends Piece{
	 public King(char a,int b,char a1,int b1)
	 {
	  super(a, b, a1, b1);
	 }

	 @Override
	 public boolean isMoveLegal(char a,  int b, char a1, int b1) {
	  int numa = Character.getNumericValue(a);
	  int numa1 = Character.getNumericValue(a1);
	  if (Math.sqrt(Math.pow(Math.abs(numa1 - numa), 2) + Math.pow(Math.abs(b1 - b), 2)) != Math.sqrt(2))	  
	   return false;
	  
	  return false;
	 }
	 
}

class Queen extends Piece{

	 public Queen(char a, int b, char a1, int b1) {
	  super(a, b, a1, b1);
	  // TODO Auto-generated constructor stub
	 }

	 @Override
	 public boolean isMoveLegal(char a, int b, char a1,  int b1) {
	  // TODO Auto-generated method stub
	  int numa = Character.getNumericValue(a);
	  int numa1 = Character.getNumericValue(a1);
	  if (numa1 - numa == b1 - b) 
		  return true;	  
	  if (b == b1)	  
		  return true;	  
	  if (numa1 == numa)	  
		  return true;
	  
	  return false;
	 }
}
class Rock extends Piece{

	 public Rock(char a, int b, char a1, int b1) {
	  super(a, b, a1, b1);
	  // TODO Auto-generated constructor stub
	 }

	 @Override
	 public boolean isMoveLegal(char a, int b, char a1,  int b1) {
	  int numa = Character.getNumericValue(a);
	  int numa1 = Character.getNumericValue(a1);
	  if (numa == numa1)	  
	   return true;
	  
	  if (b == b1)	  
	   return true;
	  
	  return false;
	 }

}

class Knight extends Piece{

	 public Knight(char a, int b, char a1, int b1) {
	  super(a, b, a1, b1);
	  // TODO Auto-generated constructor stub
	 }

	 @Override
	 public boolean isMoveLegal(char a,  int b, char a1, int b1) {
	  // TODO Auto-generated method stub
	  int numa = Character.getNumericValue(a);
	  int numa1 = Character.getNumericValue(a1);
	  if (numa1 != numa -1 && numa1 != numa +1 && numa1 != numa +2 && numa1 != numa -2)
	  {
	   return false;
	  }
	  if (b1 != b -1 && b1 != b +1 && b1 != b +2 && b1 != b -2)
	  {
	   return false;
	  }
	  return true;
	 }
	 
	 
	}

class Bishop extends Piece{

	 public Bishop(char a, int b, char a1, int b1) {
	  super(a, b, a1, b1);
	  // TODO Auto-generated constructor stub
	 }

	 @Override
	 public boolean isMoveLegal(char a, int b, char a1,  int b1) {
	  // TODO Auto-generated method stub
	  int numa = Character.getNumericValue(a);
	  int numa1 = Character.getNumericValue(a1);
	  if (numa1 - numa == b1-b)
	  {
	   return true;
	  }
	  return false;
	 }
}
	