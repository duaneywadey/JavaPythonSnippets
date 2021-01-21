package oopprojects;
import java.util.*;


public class aarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		aarray obj = new aarray();
		
		int ar1[] = {43,645,6,86,636,85,226,8685,463};
		int[] ar2 = new int[20];
		
		int x = 1; // 
		int[] y = new int[10]; // 
	
		
		int numbers1 []= {54,76,46,323,667,886,5};
		
		 
		 int[] deck = new int[52];
		 String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		  String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
		  "10", "Jack", "Queen", "King"};
		 
		  // Initialize the cards
		  for (int i = 0; i < deck.length; i++)
		  deck[i] = i;
		 
		  // Shuffle the cards
		  for (int i = 0; i < deck.length; i++) {
			  
		  // Generate an index randomly
		  int index = (int)(Math.random() * deck.length);
		  int temp = deck[i];
		  deck[i] = deck[index];
		  deck[index] = temp;
		  }
		 
		  // Display the first four cards
		  for (int i = 0; i < 4; i++) {
			  String suit = suits[deck[i] / 13];
			  String rank = ranks[deck[i] % 13];
			  System.out.println("Card number " + deck[i] + ": "
					  + rank + " of " + suit);
		  }
	
		  int f [] = {54,65,23};
		  int g [] = {34,68,4};
		  
		  
		
		  int[] a = {1,2,3,4,5,6,7,8,9,10};
		  
		   // Swap elements using the swap method
		   System.out.println("Before invoking swap");
		   System.out.println("array is {" + a[4] + ", " + a[9] + "}");
		   swap(a[4], a[9]);
		   System.out.println("After invoking swap");
		   System.out.println("array is {" + a[4] + ", " + a[9] + "}");
		  
		   // Swap elements using the swapFirstTwoInArray method
		   System.out.println("Before invoking swapFirstTwoInArray");
		   System.out.println("array is {" + a[4] + ", " + a[9] + "}");
		   swapFirstTwoInArray(a);
		   System.out.println("After invoking swapFirstTwoInArray");
		   System.out.println("array is {" + a[4] + ", " + a[9] + "}");
		   
		   int randnums[] = {43,54,6,425,2,64,25,5,63};
		   for (int y1=0; y1<randnums.length; y1++) {
			   if (randnums[y1]%2==0) {
				   System.out.println(randnums[y1]);
				  
			   }
			   else {
				   continue;
			   }
			   
			   
		   
			  
		   }
		   
			// Inserting elements of an array to a new array
			int oldarray [] = {2,73,4,72,84,942,34,5,24,23};
			int[] newarray = new int[10];
					
			for (int s=0; s < oldarray.length; s++) {
				newarray[s] = oldarray[s];	
			}
			System.out.println("NEW ARRAY: " + Arrays.toString(newarray));
			
			
			
			 int [] firstArray = new int[5];
				System.out.print("Enter " + firstArray.length+ " values: ");
				for (int i1 = 0; i1 < firstArray.length; i1++) {
					firstArray[i1] = scan.nextInt();
				}
			
				int[] secondArray = new int[5];
				System.out.println("Enter " + secondArray.length+ " values: ");
				for(int z=0; z< secondArray.length; z++) {
					secondArray[z] = scan.nextInt();
					}
				int cap = firstArray.length + secondArray.length;
				
				int[] newarrayagain = new int[cap];
				
						
				for (int s=0; s < firstArray.length; s++) {
					newarrayagain[s] = firstArray[s];	
				}
				for(int h=0; h<secondArray.length; h++) {
					newarrayagain[h] = secondArray[h];	
					
				}
				System.out.println(Arrays.toString(firstArray));
			
				System.out.println(Arrays.toString(newarrayagain));
		   }
	
	
		
	
		  
		   /** Swap two variables */
		   public static void swap(int n1, int n2) {
		   int temp = n1;
		   n1 = n2;
		   n2 = temp;
		   }
		  
		   /** Swap the first two elements in the array */
		   public static void swapFirstTwoInArray(int[] array) {
		   int temp = array[0];
		  	array[0] = array[1];
		   array[1] = temp;
		   }
		   
			
			
	
	
	
		
		
			public int met(int numbers1 [], int val) {
				return numbers1[val];
			
			}
			
}

			
			
			
			
			
		

	


