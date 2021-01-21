package ooppractice;
import java.util.Scanner;
import java.util.Random;

public class stringmanips {
	
	static int numList[] = {34,75,3,83,8};
	public int printN(int numList[]) {
		return numList[numList.length-1];
		
	}
	

	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);
		Random rand = new Random();
		stringmanips ll = new stringmanips();
		ll.printN(numList);
		int ltn = rand.nextInt(5);
		String wrd = "Deoxyribonucleic Acid";
		System.out.println(wrd.substring(0,5));
		System.out.println("Name: " + wrd);
		System.out.println("Username: " + (wrd.substring(0,5)));
		System.out.println("Character length: " + (wrd.length()));
		int g = wrd.length();
		char letter = wrd.charAt(ltn + 1);
		System.out.println("Secret letter: " + letter);
		for (int sep=0; sep<=g-1; sep++) {
			System.out.println(sep+ ".) " + "character: " + wrd.charAt(sep));
		}
		
		
		
		System.out.println("Enter a number");
		
		
		int q = scan.nextInt();
		if(q%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
		
	}
	

}
