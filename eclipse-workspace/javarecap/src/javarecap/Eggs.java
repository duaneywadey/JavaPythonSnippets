package javarecap;
import java.util.Scanner;
public class Eggs {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of eggs: ");
		double nofeggs = scan.nextDouble();
		numberOfEggs(nofeggs);
		remainingEggs(nofeggs);
		
	}
	static double numberOfEggs(double nofeggs) {
		int dofeggs = (int)nofeggs / 12;
		int dozens = (int) Math.floor(dofeggs);
		System.out.println("Number of dozens: " + dozens);
		return dozens ;
	}
	static int remainingEggs(double nofeggs) {
		int remainingEggs = (int)nofeggs % 12;
		System.out.println("Remaining number of eggs: " + remainingEggs);
		return remainingEggs;
	
		
	}

}
