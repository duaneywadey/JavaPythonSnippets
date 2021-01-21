package ooppractice;
import java.util.Scanner;


public class methodpractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numvalue = 505000;
		System.out.println("This is number " + numvalue);
		addFive(numvalue);
		System.out.println("Again this first number is " + numvalue);
		System.out.println("Type a number: ");
		int fnum = scan.nextInt();
		System.out.println("Type another number: ");
		int snum = scan.nextInt();
		System.out.println("Type last number: ");
		int tnum = scan.nextInt();
		System.out.println("The sum is equal to "  );
		addNumbers(fnum, snum);
		addMore(numvalue);
		System.out.println("The average is equal to: ");
		averageNumbers(fnum, snum, tnum);
		int gnum = greatest(435,357,7435);
		System.out.println(gnum);
		
	}
	public static void addFive(int numvalue) {
		System.out.println("This function holds " + numvalue);
		numvalue+=5;
		System.out.println("Again, this function holds " + numvalue);
		System.out.println("Just the number ");
		int numberten = giveTen();
		System.out.println("This is the number " + numberten);
		double decifive = giveDecimal();
		double percentage = numvalue * decifive;
		System.out.println("The decimal is " + decifive + "and the value obtained is equal to " + percentage);

		
	}
	public static void addMore(int numvalue) {
		System.out.println("The number is now equal to " + numvalue);
		numvalue+=100;
			
	}
	public static int giveTen() {
		return 10;
	}
	public static double giveDecimal() {
		return 0.5500;
		
	}
	public static int addNumbers(int fnum, int snum) {
		int addnums = fnum + snum; 
		System.out.println(addnums);
		return addnums;
		
	}
	public static double averageNumbers(int fnum, int snum, int tnum) {
		int alladd = fnum + snum + tnum;
		double avg = alladd / 3.0;
		System.out.println(avg);
		return avg;
		
	}
	public static int greatest(int no, int nt, int ntr) {
		if (no > nt && no > ntr) {
			return no;
			
		}
		else if (nt > no && nt > ntr) {
			return nt;
		}
		else {
			return ntr;
		}
	
	}

}
