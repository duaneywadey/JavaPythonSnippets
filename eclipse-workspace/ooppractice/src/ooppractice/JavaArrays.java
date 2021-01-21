package ooppractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaArrays {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		for(int sp=0; sp<5; sp++) {
			System.out.println();
		}
		int nums[] = {35,64,75,25,86,80,4,6,57,85,97,5};
		for (int j=0; j<5; j++) {
			System.out.println(nums[j]);
		} 
		int a[] = {7,4,3,5};
		int b[] = {3,6,8,6};
		int c[] = {1,6,8,3};
		
		int d[][] = {
				{7,4,3,5,76,24,57,79,2},
				{57,37,36,9,86,3,836,94,64},
				{7,9,6,64,56823,795,26,8,5}
		
		};
		
		
		for (int g=0; g<3; g++) {
			for (int h=0; h<9;h++) {
				System.out.print(" " + d[g][h]);
			}
			System.out.println();
		}

		int e[] = {57,37,36,9,86,3,836,94,64};
		for (int k=8; k>0; k--) {
			System.out.println(" " + e[k]);
		}
		System.out.println();
		int list[] = {43,65,75,3,24,86,12,68,35,97,46,2,63,47,4,8,3,83,835};
		int counter = 0;
		for (int e1=0; e1<list.length; e1++) {
			counter+=list[e1];
		}System.out.println(counter);
		
		// Find the maximum element
		double max = list[0];
		for (int counter1 = 1; counter1 < list.length; counter1++)
		{
		     if (list [counter1] > max)
		     {
		      max = list[counter1];
		     }
		}

		System.out.println("The highest maximum for the December is: " + max);
		System.out.println("How many elements?");
		int i = scan.nextInt();
		while (i>20 || i<=0) {
			System.out.println("Invalid!");
			i = scan.nextInt();
		}
		
		
		if (i%2!=0) {
			System.out.println("Error");
		}
		else {
			int [] groupNumbers = new int[i];
			fillArrayOfIntegers(groupNumbers);
			printArrayOfIntegers(groupNumbers);
		}
		
		
		}

	
	private static void printArrayOfIntegers(int[] groupNumbers) {
		
		System.out.println("The elements are: ");
		System.out.println(Arrays.toString(groupNumbers));
			
		}
	
	private static void fillArrayOfIntegers(int[] groupNumbers) {
		
		
		
			for(int d=0; d<groupNumbers.length; d++) {
				Scanner scan = new Scanner(System.in);
				groupNumbers[d] = scan.nextInt();
			
			
		}
		
		
	}
	

	}


