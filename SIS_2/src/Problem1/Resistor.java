package Problem1;

public class Resistor extends Circuit{
	
	private double pottentialDifference, resistance;
	
	public Resistor(double resistance) {
		// TODO Auto-generated constructor stub
		this.resistance = resistance;
	}
	
	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return resistance;
	}

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return pottentialDifference;
	}

	@Override
	public void applyPotentialDiff(double v) {
		// TODO Auto-generated method stub
		this.pottentialDifference = v;
	}

}
