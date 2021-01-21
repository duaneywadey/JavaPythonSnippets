package ooppractice;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrays1 {
	
	// Get the factorial value of an array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int myarray[] = {45,2,54,5,565,35,654,12,8,65,2,86};
	int cnt=1;
	
	for(int q: myarray) {
		cnt*=q;
	}
	System.out.println(cnt);
	
	// Printing an array
	System.out.println("Original arrangement: " + Arrays.toString(myarray));
	
	// Sorting an array
	Arrays.sort(myarray);
	System.out.println("Sorted: " + Arrays.toString(myarray));
	
	// 2D array
	int [][]a = new int[10][10];
	for(int i=0; i<10; i++) {
		for (int j=0; j<10; j++) {
			System.out.printf("-", a[i][j]);
		}
		System.out.println();
	}
	
	// Finding the average
	int avg[] = {88,78,78,98,78,80,80,98,89};
	int cn=0;
	int no = avg.length;
	for (int j:avg) {
		cn+=j;
		
	} double fa = Math.floor(cn/no);
	System.out.println("YOUR AVERAGE: " + fa);
	
	// Testing if an element is part of the array
		int find[] = {65,98,54,34,23,76};
		boolean x = contains(find, 23);
		boolean y = contains(find, 45);
		if (x == true) {
			System.out.println("Nice!");
		}
		System.out.println("Index position of 23 is: "
                + findIndex(find, 23));
		
		// Inserting elements of an array to a new array
		int oldarray [] = {2,73,4,72,84,942,34,5,24,23};
		int[] newarray = new int[10];
				
		for (int s=0; s < oldarray.length; s++) {
			newarray[s] = oldarray[s];	
		}
		System.out.println("NEW ARRAY: " + Arrays.toString(newarray));
		
		// With a particular range
		int fourelements[] = Arrays.copyOfRange(newarray, 0, 4);
		System.out.println("First 4 elements: " + Arrays.toString(fourelements));
		
		
		// MAKING AN ARAY OUT OF USER INPUT 
		  
				 double[] myList = new double[10];
					System.out.print("Enter " + myList.length + " values: ");
					for (int i = 0; i < myList.length; i++) {
					myList[i] = scan.nextDouble();
					}
					System.out.println(Arrays.toString(myList));
					

					String [] friends = new String[3];
					System.out.println("Enter " + friends.length + " names: ");
					for (int k=0; k<friends.length; k++) {
						friends[k] = scan.nextLine();
					}
					System.out.println("NAMES: ");
					for (int q=0; q<friends.length;q++) {
						System.out.println("\t " + friends[q]);
					}
					System.out.println("Enter how many students: ");
					int numStud = scan.nextInt();
					int [] studArray = new int[numStud];
					System.out.print("Enter " + studArray.length + " values: ");
					for (int z = 0; z < studArray.length; z++) {
						studArray[z] = scan.nextInt();
						}
					System.out.println(Arrays.toString(studArray));
					
					
					
					
					for(int k=0; k<studArray.length;k++) {
						if (studArray[k] >= 90) {
							System.out.println(studArray[k] + "	-	Very good");
						}
						else if(studArray[k] >= 85) {
							System.out.println(studArray[k] + "	-	Good");
							
						}
						else if(studArray[k] >= 75) {
							System.out.println(studArray[k] + "	-	Satisfactory");
							
						}
						else if(studArray[k] <= 75) {
							System.out.println(studArray[k] + "	-	Failed");
							
						}
					}
					int alice[] = new int[3];
					int bob[] = new int[3];
					 System.out.println("enter elements");

				        for(int i=0;i<alice.length;i++){//for reading array
				            alice[i]=scan.nextInt();

				        }
				        for(int j=0;j<bob.length; j++) {
				        	bob[j]=scan.nextInt();
			        }
				        for(int pr:alice) {
				        	System.out.println(pr);
				        }
				        for(int pr:bob) {
				        	System.out.println(pr);
				        }
					
		
			}
	
	
	
	// Checking if an element is part of a list
	public static boolean contains(int[]arr, int index) {
		for(int f:arr) {
			if(index==f) {
				return true;
			}	
		}
		return false;
		
		
		// Linear search (Finding the index of an element)	
	}
	public static int findIndex(int find[], int ff) {
		if(find == null) {
			return -1;
		}
		int haba = find.length;
		int z = 0;
		
		while(z<haba) {
			
			if(find[z] == ff) {
				return z;
			}
			else {
				z++;
			}
			
		}
		return -1;
		
		
	}
	
	
	
	
	
	
	
}