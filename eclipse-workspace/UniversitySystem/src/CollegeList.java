import java.util.*;
public class CollegeList {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CollegeEmployee [] CE = new CollegeEmployee[5];
		for (int i = 0; i <= 4; i++) {
		    CE[i] = new CollegeEmployee();
		}
		
		Faculty [] F = new Faculty[5];
		for (int i = 0; i <=3; i++) {
		    F[i] = new Faculty ();
		}
		
		Student [] S = new Student[8];
		for (int i = 0; i <=7; i++) {
		    S[i] = new Student();
		}
		
		
	
		CE[1] = new CollegeEmployee();
		CE[1].setFirstName("\nFirst name: Ivan");
		CE[1].setLastName("\nLast name: Duno");
		CE[1].setAddress("\nAddress: Earth");
		CE[1].setPhoneNumber("\nPhone number: 12212112");
		CE[1].setZipCode("\nZip Code: 5443");
		CE[1].setSocialSecurityNumber("\n SS number: 3353535335");
		CE[1].setAnnualSalary("\nAnnual Salary: 30000");
		CE[1].setDepartmentName("\nDepartment name: Engineering");
		
	
		
		
		CE[2] = new CollegeEmployee();
		CE[2].setFirstName("\nFirst name: Ivefan");
		CE[2].setLastName("\nLast name: Duehno");
		CE[2].setAddress("\nAddress: Earebth");
		CE[2].setPhoneNumber("\nPhone number: 1221253112");
		CE[2].setZipCode("\nZip Code: 5443");
		CE[2].setSocialSecurityNumber("\n SS number: 3353535335");
		CE[2].setAnnualSalary("\nAnnual Salary: 30000");
		CE[2].setDepartmentName("\nDepartment name: Engineering");
		
		CE[3] = new CollegeEmployee();
		CE[3].setFirstName("\nFirst name: Ivafan");
		CE[3].setLastName("\nLast name: Dunfao");
		CE[3].setAddress("\nAddress: Eartach");
		CE[3].setPhoneNumber("\nPhone number: 1242212112");
		CE[3].setZipCode("\nZip Code: 5443");
		CE[3].setSocialSecurityNumber("\n SS number: 334253535335");
		CE[3].setAnnualSalary("\nAnnual Salary: 30000");
		CE[3].setDepartmentName("\nDepartment name: Engineering");
		
		
		CE[4] = new CollegeEmployee();
		CE[4].setFirstName("\nFirst name: Ivoyoan");
		CE[4].setLastName("\nLast name: Dunoyo");
		CE[4].setAddress("\nAddress: Earyoth");
		CE[4].setPhoneNumber("\nPhone number: 1225712112");
		CE[4].setZipCode("\nZip Code: 544643");
		CE[4].setSocialSecurityNumber("\n SS number: 3353535335");
		CE[4].setAnnualSalary("\nAnnual Salary: 30000");
		CE[4].setDepartmentName("\nDepartment name: Engineering");

		
		F[1] = new Faculty();
		F[1].setFirstName("\nFirst name: IvaDDn");
		F[1].setLastName("\nLast name: DuDAno");
		F[1].setAddress("\nAddress: EarDADth");
		F[1].setPhoneNumber("\nPhone number: 122153112");
		F[1].setZipCode("\nZip code: 54243");
		F[1].setSocialSecurityNumber("\nSS no: 3353535335");
		F[1].setAnnualSalary("\nAnnual salary: 30000");
		F[1].setDepartmentName("\nDepartment name: Engineering");
		
	
		
		F[2] = new Faculty();
		F[2].setFirstName("\nFirst name: IvasaDDn");
		F[2].setLastName("\nLast name: DuDasAno");
		F[2].setAddress("\nAddress: EarDAadDth");
		F[2].setPhoneNumber("\nPhone number: 122153112");
		F[2].setZipCode("\nZip code: 54243");
		F[2].setSocialSecurityNumber("\nSS no: 3353535335");
		F[2].setAnnualSalary("\nAnnual salary: 30000");
		F[2].setDepartmentName("\nDepartment name: Engineering");
		
		
		F[3] = new Faculty();
		F[3].setFirstName("\nFirst name: IvaDasDn");
		F[3].setLastName("\nLast name: DuDsaAno");
		F[3].setAddress("\nAddress: EardaDADth");
		F[3].setPhoneNumber("\nPhone number: 122153112");
		F[3].setZipCode("\nZip code: 54243");
		F[3].setSocialSecurityNumber("\nSS no: 3353535335");
		F[3].setAnnualSalary("\nAnnual salary: 30000");
		F[3].setDepartmentName("\nDepartment name: Engineering");
		
		
		
		
		S[1] = new Student();
		S[1].setFirstName("\nFirst name: Jenkins");
		S[1].setLastName("\nLast name: DuDAnsao");
		S[1].setAddress("\nAddreess: Earartth");
		S[1].setPhoneNumber("\nPhone number: 122153112");
		S[1].setZipCode("\nZip code: 54243");
		S[1].setGradePointAverage("\nGPA: 1.25");
		S[1].setMajorFieldOfStudy("\nMajor: Biology");
		
		
		S[2] = new Student();
		S[2].setFirstName("\nFirst name: Jenaskins");
		S[2].setLastName("\nLast name: DuDAnagsao");
		S[2].setAddress("\nAddreess: Earargatth");
		S[2].setPhoneNumber("\nPhone number: 122153112");
		S[2].setZipCode("\nZip code: 54243");
		S[2].setGradePointAverage("\nGPA: 1.25");
		S[2].setMajorFieldOfStudy("\nMajor: Biology");
		
		
		S[3] = new Student();
		S[3].setFirstName("\nFirst name: Jenkinacs");
		S[3].setLastName("\nLast name: DuDAnsacao");
		S[3].setAddress("\nAddreess: Eararttach");
		S[3].setPhoneNumber("\nPhone number: 122153112");
		S[3].setZipCode("\nZip code: 54243");
		S[3].setGradePointAverage("\nGPA: 1.25");
		S[3].setMajorFieldOfStudy("\nMajor: Biology");
		
		
		S[4] = new Student();
		S[4].setFirstName("\nFirst name: Jasenkins");
		S[4].setLastName("\nLast name: DuDsasAnsao");
		S[4].setAddress("\nAddreess: Eararsatth");
		S[4].setPhoneNumber("\nPhone number: 122153112");
		S[4].setZipCode("\nZip code: 54243");
		S[4].setGradePointAverage("\nGPA: 1.25");
		S[4].setMajorFieldOfStudy("\nMajor: Biology");
		
		S[5] = new Student();
		S[5].setFirstName("\nFirst name: Jaassenkins");
		S[5].setLastName("\nLast name: DuDsaaesAnsao");
		S[5].setAddress("\nAddreess: Eararsataeth");
		S[5].setPhoneNumber("\nPhone number: 1212153112");
		S[5].setZipCode("\nZip code: 54243");
		S[5].setGradePointAverage("\nGPA: 1.25");
		S[5].setMajorFieldOfStudy("\nMajor: Biology");
		
		S[6] = new Student();
		S[6].setFirstName("\nFirst name: Jaagassenkins");
		S[6].setLastName("\nLast name: DuDsaaoiesAnsao");
		S[6].setAddress("\nAddreess: Eararsataeweth");
		S[6].setPhoneNumber("\nPhone number: 1212153112");
		S[6].setZipCode("\nZip code: 54243");
		S[6].setGradePointAverage("\nGPA: 1.2500");
		S[6].setMajorFieldOfStudy("\nMajor: Biology");
		
		S[7] = new Student();
		S[7].setFirstName("\nFirst name: Jaagafassenkins");
		S[7].setLastName("\nLast name: Dudeewsaaoiesansao");
		S[7].setAddress("\nAddreess: Eararsataeweth");
		S[7].setPhoneNumber("\nPhone number: 1212153112");
		S[7].setZipCode("\nZip code: 54243");
		S[7].setGradePointAverage("\nGPA: 1.2500");
		S[7].setMajorFieldOfStudy("\nMajor: Biology");
		
		
		while(true) {
			System.out.println("\nEnter a letter");
			String  i = scan.nextLine();
			
			if(i.equalsIgnoreCase("Q")) {
			    System.exit(0);
			}
			
			else if (i.equalsIgnoreCase("C")){
				System.out.println("\n\n==========College Employees===============");
				for (int a=1; a<=4; a++) {
					System.out.println(CE[a].getAll());
				}
			}
			
			else if (i.equalsIgnoreCase("F")) {
					System.out.println("\n\n================Faculty=================");
					for (int a=1; a<=3; a++) {
						System.out.println(F[a].getAll());
					}
				}
			
			else if (i.equalsIgnoreCase("S")) {
				System.out.println("\n\n====================Student===================");
				for (int a=1; a<=7; a++) {
					System.out.println(S[a].getAll());
				}
				
			
			}
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
