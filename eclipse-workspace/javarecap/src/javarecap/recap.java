package javarecap;
import java.util.Scanner;
import java.util.Random;

public class recap {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random rand = new Random();
		//System.out.print("Enter your name: ");
		//String a = scan.nextLine(); 
		System.out.print("Welcome" );
		int ab = rand.nextInt(24);
		int low = 18;
		int high = 34;
		int result = rand.nextInt(high-low) + low;
		System.out.println(", I guess you're already " + result + " years old.");
		while (true) {
		System.out.println("Enter a name: ");
		String realname = scan.nextLine();
		System.out.println("Enter the password: ");
		String passw = scan.nextLine();
		if (realname.equals("Ivan") && passw.equals("123")) {
			System.out.println("Welcome user!");
			break;
		}
			else if (realname.equals("Ivan") && !passw.equals("123")) {
				System.out.println("Invalid password");
				continue;
				
			}
			else if (!realname.equals("Ivan") && passw.equals("123")) {
				System.out.println("Invalid username");
				continue;
			}
			else {
				System.out.println("Invalid username and password");
			}
		}
		for (int cnt=0; cnt<=5; cnt++) {
			int sum1 = rand.nextInt(10);
			int sum2 = rand.nextInt(10);
			int anssum = sum1 + sum2;
			System.out.println("QUESTION: " + sum1 + " + " + sum2);
			int trial = scan.nextInt();
			while (trial != anssum) {
				System.out.println("QUESTION: " + sum1 + " + " + sum2);
				trial = scan.nextInt();
			}
			System.out.println("Congrats! The answer is " + anssum);
	}
}
		


		

		
		
	


