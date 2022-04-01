
public class GradesArray {
	public static void main(String[] args) {
		int [] arrayGrades = {87,85,84,86,79,94,91,76};
		int cnt=0;
		for(int g: arrayGrades)
	        cnt+=g;
	    System.out.println("Average grade is: " + cnt / arrayGrades.length);

	}

}
