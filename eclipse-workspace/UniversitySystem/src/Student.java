
public class Student extends Person{
	String majorFieldOfStudy;
	double gradePointAverage;
	
	public String getAll() {
		return "\nFirst name: " +  firstname + "\nLast name: " + lastname + "\nAddress: " + address + "\nZipcode: " + zipcode
				 + "\nPhone number: " + phonenumber + "\nGPA: " + gradePointAverage + "\nMajor: " + majorFieldOfStudy;
	}

	public void setGradePointAverage(double gradePointAverage ) {
		this.gradePointAverage = gradePointAverage;
		
	}
	
	public void setMajorFieldOfStudy (String majorFieldOfStudy ) {
		this.majorFieldOfStudy = majorFieldOfStudy;
		
	}

}
