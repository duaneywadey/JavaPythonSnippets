package ooppractice;
import java.util.Scanner;
public class pracclass {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int errors = 0;
		   System.out.println("Press (q) or (n) to QUIT: ");
		while (true) {
			System.out.println("Enter your name: ");
			String command = scan.nextLine();
		    if (command.equals("Ivan")) {
		    	System.out.println("Welcome!");
		    	break;
		    }
		    else if (!command.equals("Ivan")) {
		    	errors+=1;
		    	if (errors == 1) {
		    		System.out.println("1st Clue: I-");
		    		continue;
		    }
		    	if (errors == 2) {
		    		System.out.println("2nd Clue: Iv-");
		    		continue;
		    }
		    	if (errors == 3) {
		    		System.out.println("Game over!");
		    		break;
		    }
		    	
		    else if (command.equals("n")|| command.equals("q")) {
		    	System.out.println("Thank you and see you later!");
		        break;
		    }
		    	int inputnum;
				do {
					System.out.println("Enter any integer except for integers less than 0: ");
					inputnum = scan.nextInt();
				} while(inputnum > 0);
					System.out.println("Done! A negative number has been detected!");
		}


	}
	
}
}