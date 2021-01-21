import java.util.*;
public class CollegeList1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CollegeEmployee [] CE = new CollegeEmployee[10];
		for (int i = 0; i <= 4; i++) {
		    CE[i] = new CollegeEmployee();
		}
		
		Faculty [] F = new Faculty[10];
		for (int i = 0; i <=3; i++) {
		    F[i] = new Faculty ();
		}
		
		Student [] S = new Student[10];
		for (int i = 0; i <=7; i++) {
		    S[i] = new Student();
		}
		
		while(true) {
			System.out.println("\nEnter a letter");
			String  i = scan.nextLine();
			
			if(i.equalsIgnoreCase("Q")) {
			    System.exit(0);
			}
			
			else if (i.equalsIgnoreCase("C")){
				System.out.println("\n\n==========College Employees===============");
				for (int a=0; a<=4; a++) {
					if (a == 4) {
						System.out.println("Up to 4 only!");
						break;
					}

					CE[a] = new CollegeEmployee();
					System.out.println("Enter your first name: ");
					String fname = scan.nextLine();
					CE[a].setFirstName(fname);
					System.out.println("Enter your last name: ");
					String lname = scan.nextLine();
					CE[a].setLastName(fname);
					System.out.println("Enter your address: ");
					String address = scan.nextLine();
					CE[a].setAddress(address);
					System.out.println("Enter your phone number: ");
					int phoneNum = scan.nextInt();
					CE[a].setPhoneNumber(phoneNum);
					System.out.println("Enter your ZipCode: ");
					int zipC = scan.nextInt();
					CE[a].setZipCode(zipC);
					System.out.println("Enter your SS no. :  ");
					int ssN = scan.nextInt();
					CE[a].setSocialSecurityNumber(ssN);
					System.out.println("Enter your annual salary: ");
					int annSalary = scan.nextInt();
					CE[a].setAnnualSalary(annSalary);
					System.out.println("Enter your department: ");
					String dept = scan.nextLine();
					CE[a].setDepartmentName(dept);
				
					
					
				}
			
				for (int a=0; a<=4; a++) {
					System.out.println(CE[a].getAll());
				}
				System.out.println("\nUp to 4 only!");
			}
			
			else if (i.equalsIgnoreCase("F")) {
					System.out.println("\n\n================Faculty=================");
					for (int a=0; a<=10; a++) {
						if (a == 3) {
							System.out.println("Up to 3 only!");
							break;
						}
						
						F[a] = new Faculty();
						System.out.println("Enter your first name: ");
						String fname = scan.nextLine();
						F[a].setFirstName(fname);
						System.out.println("Enter your last name: ");
						String lname = scan.nextLine();
						F[a].setLastName(fname);
						System.out.println("Enter your address: ");
						String address = scan.nextLine();
						F[a].setAddress(address);
						System.out.println("Enter your phone number: ");
						int phoneNum = scan.nextInt();
						F[a].setPhoneNumber(phoneNum);
						System.out.println("Enter your ZipCode: ");
						int zipC = scan.nextInt();
						F[a].setZipCode(zipC);
						System.out.println("Enter your SS no. :  ");
						int ssN = scan.nextInt();
						F[a].setSocialSecurityNumber(ssN);
						System.out.println("Enter your annual salary: ");
						int annSalary = scan.nextInt();
						F[a].setAnnualSalary(annSalary);
						System.out.println("Enter your department: ");
						String dept = scan.nextLine();
						F[a].setDepartmentName(dept);
						
						
					}
					for (int a=0; a<=3; a++) {
						System.out.println(F[a].getAll());
					}
					System.out.println("\nUp to 3 only!");
				}
						
					
				
			

			else if (i.equalsIgnoreCase("S")) {
				System.out.println("\n\n====================Student===================");
				
				for (int a=0; a<=10; a++) {
					if (a == 8) {
						System.out.println("Up to 8 only!");
						break;
					}
					S[a] = new Student();
					System.out.println("Enter your first name: ");
					String fname = scan.nextLine();
					S[a].setFirstName(fname);
					System.out.println("Enter your last name: ");
					String lname = scan.nextLine();
					S[a].setLastName(fname);
					System.out.println("Enter your address: ");
					String address = scan.nextLine();
					S[a].setAddress(address);
					System.out.println("Enter your phone number: ");
					int phoneNum = scan.nextInt();
					S[a].setPhoneNumber(phoneNum);
					System.out.println("Enter your ZipCode: ");
					int zipC = scan.nextInt();
					S[a].setZipCode(zipC);
					System.out.println("Enter your grade point average: ");
					double gpa = scan.nextDouble();
					S[a].setGradePointAverage(gpa);
					System.out.println("Enter your major: ");
					String maj = scan.nextLine();
					S[a].setMajorFieldOfStudy(maj);
					
					
					
				}
				
				for (int a=0; a<=7; a++) {
					System.out.println(S[a].getAll());
				}
				System.out.println("\nUp to 8 only!");
				
			}
			
		break;
		}
		
		
	
	}
		
	}
		
	

	



