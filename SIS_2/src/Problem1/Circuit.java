package Problem1;

public abstract class Circuit {
	
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double v);
	
	public double getPower() { //P = U^2 / R
		return getPotentialDiff() * getPotentialDiff() / getResistance();	
	}
	
	public double getCurrent() { //I = U / R
		return getPotentialDiff() / getResistance();
	}
}
