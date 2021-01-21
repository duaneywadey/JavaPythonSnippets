package ooppractice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class LoopsPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Enter first number: ");
		int first = rand.nextInt(5);
		System.out.println(first);
		System.out.println("Enter second number: ");
		int second = rand.nextInt(10);
		System.out.println(second);
		int sum = 0;
		for(int i=first;i<=second; i++){
		    sum+=i;
		}
		System.out.println("the total sum is "+ sum);
		int mult = 1;
		for (int e=first; e<=second; e++) {
			mult*=e;
		}
		System.out.println(mult);
		
		
	}
		

}
	 



