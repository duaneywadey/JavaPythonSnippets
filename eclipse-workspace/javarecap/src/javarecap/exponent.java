package javarecap;
import java.util.Scanner;
public class exponent {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number: ");
	int numInputted = scan.nextInt();
	getSquare(numInputted);
	getCube(numInputted);
	}
	
	static int getSquare(int numInputted) {
		int timesTwo = numInputted * numInputted;
		System.out.println("Squared: " + timesTwo);
		return timesTwo;
	}
	static int getCube(int numInputted) {
		int timesThree = numInputted * numInputted * numInputted;
		System.out.println("Cubed: " + timesThree);
		return timesThree;
	}
			}


