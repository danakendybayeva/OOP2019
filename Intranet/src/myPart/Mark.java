package myPart;

public class Mark {
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
}