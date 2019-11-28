package task1;

public class UsingInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

interface Speed{
	void showSpeed();
}

interface Model{
	void giveModelName();
}
// all the methods in interface are abstract so they must be implemented in the class that implements this interface
// class can implement more than one interface

class Car implements Speed, Model{

	@Override
	public void showSpeed() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void giveModelName() {
		// TODO Auto-generated method stub
		
	}
}

class Phone implements Model{

	@Override
	public void giveModelName() {
		// TODO Auto-generated method stub
		
	}
	
}

class Internet implements Speed{

	@Override
	public void showSpeed() {
		// TODO Auto-generated method stub
		
	}
	
}