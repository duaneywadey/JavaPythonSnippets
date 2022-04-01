
import java.util.Arrays;
import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {			
		Scanner input = new Scanner(System.in);
        int array[] = new int[5];

        System.out.println("Enter five numbers ranging from (1-20): ");
        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
        }
        System.out.println("These are the numbers you have entered.");      
        input.close();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        int[] numbers = {1,2,3,4,5};
        
	     //Generates 10 Random Numbers in the range 1 -20
	     for(int i = 0; i < numbers.length; i++) {
	       numbers[i] = (int)(Math.random()*20 + 1);
	     }//end for loop
	     System.out.println("\n\nWinning numbers: " + Arrays.toString(numbers));
	     
	     if (Arrays.equals(array, numbers))
	            System.out.println("\nYou won!");
	        else
	            System.out.println("\nSorry, try again");
    }

	}


