package ooppractice;
import java.util.Scanner;
public class TypePractice {
  

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// User enters the array capacity
	   System.out.println("Enter the number of : ");
	   int n = scan.nextInt();
	   
	   // Initializing the array
	   String [] numbers = new [n];
	   int sum=0;
	   int countermult=1;
	   
	   System.out.println("Enter the numbers");
	   for(int j=0; j<n; j++) {
		   numbers[j] = scan.nextInt();
		   countermult*=numbers[j];
		   
				   }
	  
	   int average = sum/n;
	   int count = 0;
	   for(int b=0; b<n; b++) {
		   if(numbers[b]> average) {
			   count++;
		   }
		   
	   }
	   System.out.println("Factorial is " + countermult);
	   System.out.println("Number of elements average " + count);
	   
	   for(int y: numbers) {
		   System.out.println(y);
		   
	   }
	   
	   
	   
		
		}
		

	}


