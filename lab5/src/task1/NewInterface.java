package task1;

public class NewInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Movable{
	void speed();
}

interface Vehicle extends Movable{
	void type();
}

class Bus implements Vehicle{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		
	}
	
}