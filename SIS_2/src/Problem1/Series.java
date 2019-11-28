package Problem1;

public class Series extends Circuit{
	private Circuit a, b;
	
	public Series(Circuit a, Circuit b) {
	    this.setA(a);
	    this.setB(b);
	  }
	
	public Circuit getA() {
		return a;
	}
	public void setA(Circuit a) {
		this.a = a;
	}
	public Circuit getB() {
		return b;
	}
	public void setB(Circuit b) {
		this.b = b;
	}
	
	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return a.getResistance() + b.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return a.getPotentialDiff() + b.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double v) {
		// TODO Auto-generated method stub
		double current = v / getResistance();
	    a.applyPotentialDiff(current * a.getResistance());
	    b.applyPotentialDiff(current * b.getResistance());
	}
}
