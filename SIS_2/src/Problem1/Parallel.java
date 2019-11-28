package Problem1;

public class Parallel extends Circuit{
	private Circuit a, b;
	
	public Parallel(Circuit a, Circuit b) {
		// TODO Auto-generated constructor stub
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
	public double getResistance() { // R = (R1 * R2) / (R1 + R2)
		// TODO Auto-generated method stub
		return (a.getResistance() * b.getResistance())/(a.getResistance() + b.getResistance());
	}

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return a.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double v) {
		// TODO Auto-generated method stub
		a.applyPotentialDiff(v);
	    b.applyPotentialDiff(v);
	}

}
