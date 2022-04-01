import java.util.*;


// Class for Addition

class Addition {
	public void mathCalcu(int a, int b) {
		System.out.println(a+b);
		
	}
}


class Subtraction extends Addition{
	
	// Show polymorphism for mathCalcu to take multiple forms
	public void mathCalcu(int a, int b) {
		System.out.println(a-b);
		
	}
	
}

class Multiplication extends Addition{
	public void mathCalcu(int a, int b) {
		System.out.println(a*b);
		
	}
	
}
class Division extends Addition{
	public void mathCalcu(int a, int b) {
		System.out.println(a/b);
		
	}
	
}


// MAIN CLASS

public class MainClass {

	public static void main(String[] args) {
		
		// Create object for each class
		
		Addition myAdd  = new Addition();
		Addition mySub  = new Subtraction();
		Addition myMult  = new Multiplication();
		Addition myDiv  = new Division();
		
		// Initialize scan for user input
		
		Scanner scan = new Scanner(System.in);
		
		// Take user input using integers a1 and b1
		System.out.println("Enter first num: ");
		int a1 = scan.nextInt();
		
		System.out.println("Enter second num: ");
		int b1 = scan.nextInt();
		
		
		// Take decision from  the user
		System.out.println("Enter a choice: ");
		System.out.println("'a' for addition");
		System.out.println("'b' for subtraction");
		System.out.println("'c' for multiplication");
		System.out.println("'d' for division");
		
		
		
		// Reinitialize scan for user input
		scan = new Scanner(System.in);
		
		String decision = scan.nextLine();
		
		
		// For input validation
		if(decision.equals("a")) {
			System.out.println(a1 + " + " + b1);
			
			// Show answer
			myAdd.mathCalcu(a1,b1);
		}
		
		else if(decision.equals("b")) {
			System.out.println(a1 + " - " + b1);
			 mySub .mathCalcu(a1,b1);
		}
		
		else if(decision.equals("c")) {
			System.out.println(a1 + " * " + b1);
			myMult .mathCalcu(a1,b1);
		}
		else if(decision.equals("d")) {
			System.out.println(a1 + " / " + b1);
			myDiv .mathCalcu(a1,b1);
		}
		
		else {
			
			// If input is invalid
			System.out.println("Invalid input!");
		}
	

	}

}
