
public class InternationalDivision extends Division {
	String divisionLocation;
	String languageSpoken;

	public InternationalDivision(String division, int accountN) {
		super(division, accountN);
	
	}
	public void setDivisionLocation(String divisionLocation) {
		this.divisionLocation = divisionLocation;
	}
	
	public void setLanguageSpoken(String languageSpoken) {
		this.languageSpoken = languageSpoken;
	}
	public String display() {
		return "\n " +  divisionName + "\n " + accountNumber + "\n " + languageSpoken + "\n " + divisionLocation;
		
	}
	
}




