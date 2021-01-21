package ooppractice;
import java.util.Scanner;
public class PersonTest {
	String fname;
	String lname;
	int a,b,c,d,e;
	static String humanname;
	static int humanbirth;
	
	public PersonTest (String ngalan, int birth) {
		humanname = ngalan;
		humanbirth = birth;
	}
	static void Trylang() {
		System.out.println("Hello");
	}
	static int testt(int numm) {
	return  numm * numm * numm;
	}
	public static void nameee(String pang) {
		System.out.println("Hello " + pang);
		
	}
	public static void weight(int wg) {
		System.out.println("The weight of your bass is equal to: " + wg);
	}
	public void pickups(int pu) {
		System.out.println("My guiitar pickups are " + pu);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PersonTest myCar = new PersonTest("Ivan", 19);
		Trylang();
		PersonTest.weight(5);
		System.out.println(testt(2));
		PersonTest.nameee("Cole");
		System.out.println(PersonTest.humanname + " " + PersonTest.humanbirth);

	}
	

	
}

