import java.util.Arrays;
import java.util.Scanner;

public class Password {
	
	public static void validatePass(String newPass) {
		
		Scanner scan = new Scanner(System.in);
		// Creating array of string length
        char[] ch = new char[newPass.length()];
        // Copy character by character into array
        for (int i = 0; i < newPass.length(); i++) {
            ch[i] = newPass.charAt(i);
        }
        
        String ivan = "Hello";
        char[] cha = new char[ivan.length()];
        // Copy character by character into array
        for (int i = 0; i < ivan.length(); i++) {
            cha[i] = ivan.charAt(i);
        }
        boolean retval2 = Arrays.equals(cha, ch);
        System.out.println("Password matching status: " + retval2);
        if (retval2 == true) {
        	 System.out.println("Enter new password: ");
          	String newPassword = scan.nextLine();
          	System.out.println("Successfully changed!"); 
        }
          
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Successfully opened account \nName: IVAN\nDate Created: March 29, 2021");
		
		// Enter the password to get access
		System.out.println("Enter the password");
		String passw = scan.nextLine();
		// Method to validate password
		validatePass(passw);
	}
}