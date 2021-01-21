
public class UseDivision extends Division {

	public UseDivision(String division, int accountN) {
		super(division, accountN);
	}

	public static void main(String[] args) {
		InternationalDivision div1 = new InternationalDivision("1st Division", 5456);
		DomesticDivision div2 = new DomesticDivision("2nd Division", 6585);
		div1.setDivisionLocation("South Carolina");
		div1.setLanguageSpoken("French");
		div2.setDivisionLocation("New Jersey West");
		System.out.println(div1.display());
		System.out.println(div2.display());

	}

}
