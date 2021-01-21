package ooppractice;
import java.util.*;

public class Main {
	static int age;
	static String name;
	static String newName;

	
	
	
	
	public Main(String name, int age, String newName) {
		Main.age = age;
		Main.name = name;
		Main.newName = "Dolan";
	
	
	}
	
	
	
	public int increaseFive(int age) {
		Main.age+=5;
		return Main.age;
		
	}
	public String namePrint(String name) {
		return Main.name;
	}
	public String nameChange(String newName) {
		return newName;
	}
	public String newName(String nameUser) {
		name = nameUser;
		return name;
	}
	

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Main john = new Main("John", 20, name);
		System.out.println("New age " + john.increaseFive(age) );
		System.out.println("Name: " + john.namePrint(name));
		System.out.println("New name: " + john.nameChange(newName));
		System.out.println("Enter new name: ");
		String nameUser = scan.nextLine();
		System.out.println("New name again: " + john.newName(nameUser));
		
				
		
	

	}

}
