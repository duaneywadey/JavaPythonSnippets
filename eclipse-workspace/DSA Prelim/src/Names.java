import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many people would you like to add: ");
		int cap = scan.nextInt();
		String array[] = new String[cap+1];
        System.out.println("Enter the " + cap + " people: " );
        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = scan.nextLine();
        }
        System.out.println("Here are the people you have entered.");      
        scan.close();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }


	}

}
