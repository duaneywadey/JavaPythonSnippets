
public class DomesticDivision extends Division {
	String divisionLocation;
	
	
	public DomesticDivision(String division, int accountN) {
		super(division, accountN);
	
	}
	
	public void setDivisionLocation(String divisionLocation) {
		this.divisionLocation = divisionLocation;
	}
	public String display() {
		return "\n " +  divisionName + "\n " + accountNumber + "\n " + divisionLocation;
		
	}



}
