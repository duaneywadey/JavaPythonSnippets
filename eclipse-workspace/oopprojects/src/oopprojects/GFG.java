package oopprojects;
import java.util.*;
public class GFG {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Student[] arr; 
        arr = new Student[5];  
       System.out.println("Enter your first name: ");
       String getFirstName = scan.nextLine();
       System.out.println("Enter your last name: ");
       String getLastName = scan.nextLine();
       System.out.println("Enter your year: ");
       String getYear = scan.nextLine();
       System.out.println("Enter your course: ");
       String getCourse = scan.nextLine();
       System.out.println("Enter your section: ");
       String getSection = scan.nextLine();
       
        arr[0] = new Student(getFirstName, getLastName, getYear, getCourse, getSection); 
        arr[0].display();
  
       
    } 

	}


class Student { 
	  
    public String name;
	private String firstName;
	private String lastName;
	private String year;
	private String course;
	private String section; 
  
 
    Student(String firstName, String lastName, String year, String course, String section) 
    { 
       
        this.firstName = firstName; 
        this.lastName = lastName;
        this.year =  year;
        this.course = course;
        this.section = section;
        
        
    } 
  
    
    public void display() 
    { 
        System.out.println("\nFirst name: " + firstName + "\nLast name: " + lastName + "\nYear: " 
    + year + "\nCourse: " + course + "\nSection: " + section );
        System.out.println(); 
    } 
}