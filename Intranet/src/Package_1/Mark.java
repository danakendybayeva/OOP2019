package Package_1;

import java.io.Serializable;

public class Mark implements Serializable{
	private double firstAttestation = 0, secondAttestation = 0, finalMark = 0;
	private String letterMark = "";
	
	public double getFirstAttestation() {
		return firstAttestation;
	}
	
	public void setFirstAttestation(double firstAttestation) {
		this.firstAttestation = firstAttestation;
	}
	
	public double getSecondAttestation() {
		return secondAttestation;
	}
	
	public void setSecondAttestation(double secondAttestation) {
		this.secondAttestation = secondAttestation;
	}
	
	public double getFinalMark() {
		return finalMark;
	}
	
	public void setFinalMark(double finalMark) {
		this.finalMark = finalMark;
	}
	
	public String getLetterMark() {
		return letterMark;
	}
	
	public void setLetterMark(String letterMark) {
		this.letterMark = letterMark;
	}
	
	
	public double getTotal() {
		return firstAttestation + secondAttestation + finalMark;
	}
	
	static String getCharScore(double value) {
		  if (value >= 95 && value <= 100)
			  return "A";
		  if (value >= 90)
			  return "A-";
		  if (value >= 85)
			  return "B+";
		  if (value >= 80)
			  return "B";
		  if (value >= 75)
			  return "B-";
		  if (value >= 70)
			  return "C+";
		  if (value >= 65)
			  return "C";
		  if (value >= 60)
			  return "C-";
		  if (value >= 55)
			  return "D+";
		  if (value >= 50)
			  return "D";
		  else 
			  return "F";
		}

	public void changeToLetter(double value) {
		letterMark = getCharScore(getTotal());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "1st attestation - " + firstAttestation + 
				"\n 2nd attestation - " + secondAttestation + 
				"\n Final - " + finalMark + 
				"\n Total - " + getTotal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(finalMark);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(firstAttestation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((letterMark == null) ? 0 : letterMark.hashCode());
		temp = Double.doubleToLongBits(secondAttestation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mark other = (Mark) obj;
		if (Double.doubleToLongBits(finalMark) != Double.doubleToLongBits(other.finalMark))
			return false;
		if (Double.doubleToLongBits(firstAttestation) != Double.doubleToLongBits(other.firstAttestation))
			return false;
		if (letterMark == null) {
			if (other.letterMark != null)
				return false;
		} else if (!letterMark.equals(other.letterMark))
			return false;
		if (Double.doubleToLongBits(secondAttestation) != Double.doubleToLongBits(other.secondAttestation))
			return false;
		return true;
	}
	
}
