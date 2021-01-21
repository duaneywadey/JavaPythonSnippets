
package testing;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class TestingClass {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int a = random.nextInt(11);
		for (int b=a; b>=0; b--) {
			for (int c=b; c>=0; c--) {
				System.out.print(c+ " ");
			}
			System.out.println();
		}
		//for (int add=0; add<=10; add++) {
			//int bb = random.nextInt(11);
			//int cc = random.nextInt(11);
			//int dd = cc + bb;
			//System.out.println(cc + "+" + bb);
			//int fg = scan.nextInt();
		//	if (fg == dd) {
			//	System.out.println("Yes, the correct answer is " + dd);
			//}
			//else {
				//System.out.println("Wrong");
			//}
			
		//} 
		int bb= 41;
		
		for(int aa=0; aa<=9; aa++) {
			int dd = aa*aa+aa+41;
			System.out.println(aa+ " " + dd);
		}
		
		float cnt = 0;
		for (int cc=0;cc<=10;cc++) {
			float dd = random.nextFloat();
			cnt+=dd;
			System.out.println("x = " + dd + " " + "Sum = " + cnt );
		}
		
		for (int ee=1; ee<20; ee++) {
			int mult = 2;
			System.out.println((ee*2)+ " " + ee);
		}
		
	}

}
