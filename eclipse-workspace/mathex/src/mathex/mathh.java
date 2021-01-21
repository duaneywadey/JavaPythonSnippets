package mathex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class mathh {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random random = new Random();
		String op[] = {"+", "-", "*", "/"};
		System.out.println(op[new Random().nextInt(op.length)] + 5);
		for (int i=0;i<=20;i++) {
			int a = random.nextInt(11);
			int b = random.nextInt(11);
			System.out.println(a + op[new Random().nextInt(op.length)] + b);
		} 
		System.out.println("Guess this number from 1-5");
		int guess = scan.nextInt();
		int ee = random.nextInt(6);
		if (guess == ee) {
	
			System.out.println("Yes! It's" + ee);
		}
		while(guess!=ee) {
			System.out.println("Guess this number from 1-5");
			int guesss = scan.nextInt();
			if (guesss == ee) {
				System.out.println("Yes! It's " + ee);
				break;
				
			}
			
		}
		int fj = random.nextInt(10);
		for (int sl=-fj;sl<=fj;sl++) {
			System.out.print(sl + " ");
		}
			
		
		ArrayList<String> list2 = new ArrayList<String>();
		for (int ppl=0; ppl<=5; ppl++) {
			System.out.println("Enter your name: ");
			String pangalan = scan.nextLine();
			list2.add(pangalan);
		}
		System.out.println("Registered applicants: ");
		Collections.reverse(list2);
		for(String name:list2) {
			System.out.println(name);
		}
		
		
	} 

}
