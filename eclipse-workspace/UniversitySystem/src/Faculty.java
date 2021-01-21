
public class Faculty extends CollegeEmployee {
	double annualsalary;
	String departmentname;
	
	public void setSocialSecurityNumber(int SocialSecurityNumber) {
		this.SocialSecurityNumber = SocialSecurityNumber;
	}
	
	public void setAnnualSalary(double salary) {
		this.annualsalary = salary;
	}
	
	public void setDepartmentName(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getAll() {
		return "\nFirst name: " +  firstname + "\nLast name: " + lastname + "\nAddress: " + address + "\nZipcode: " + zipcode
				 + "\nPhone number: " + phonenumber + "\nSocial Security Number: " + SocialSecurityNumber + "\nAnnual Salary: " 
				+ annualsalary + "\nDepartment name: " + departmentname;
	}


}
