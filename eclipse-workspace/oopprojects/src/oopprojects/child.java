package oopprojects;

public class child extends Parent {

	public child(String studentName, String studentGender, int studentAge) {
		super(studentName, studentGender, studentAge);	
	}

	public static void main(String[] args) {
		Parent obj1 = new Parent("Duaney", "Male", 19);
		obj1.setName("Duaney");
		System.out.println(obj1.showName());
		System.out.println(obj1.showAge() + " " + obj1.showGender() );
		

	}

}
