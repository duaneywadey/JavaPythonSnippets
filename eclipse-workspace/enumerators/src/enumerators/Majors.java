package enumerators;
import java.util.Scanner;

public enum Majors {
	ACC("Business Division"), CHEM("Science Division"), CIS("Business Division"), ENG("Humanities Division"), 
	HIS("Humanities Division"), PHYS("Science Division"); 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Majors division = Majors.ACC;
		Majors division2 = Majors.CHEM;
		Majors division3 = Majors.HIS;
		
		System.out.println("Enter the division below (TYPE IN UPPERCASE 'EX: ACC')");
		String choice = scan.nextLine();
		
		switch(choice) {
		case "ACC":
			System.out.println(division.div);
			break;
		case "CIS":
			System.out.println(division.div);
			break;
		case "CHEM":
			System.out.println(division2.div);
			break;
		case "PHYS":
			System.out.println(division2.div);
			break;
		case "ENG":
			System.out.println(division3.div);
			break;
		case "HIS":
			System.out.println(division3.div);
			break;
		}
		
		}
		
	String div;
	
	Majors(String div){
		this.div =  div;
		
	}

}
