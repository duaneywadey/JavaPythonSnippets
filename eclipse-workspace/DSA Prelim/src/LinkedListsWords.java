import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListsWords {

	public static void main(String[] args) {
		  Scanner scan = new Scanner (System.in);
		  LinkedList<String> words = new LinkedList<String>();
		  for(int i=0; i<=4; i++) {
			  System.out.println("Enter a random word: ");
			  String randWord = scan.nextLine();
			  words.add(randWord);
		  }
		  System.out.println("\nList of words printed: " + words);
		 
	}

}
