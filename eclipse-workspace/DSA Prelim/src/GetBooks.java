import java.util.Stack;  
import java.util.Random;
import java.util.Scanner;

public class GetBooks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> books= new Stack<>();  
		books.push("Anna Karenina");
		books.push("To Kill a Mockingbird");
		books.push("The Great Gatsby");
		books.push("One Hundred Years of Solitude");
		books.push("A Passage to India");
		
		System.out.println("List of stacked books: " + books); 
		String element1 =  books.pop();
		System.out.println("Getting the book that's stacked at the very top...." + "\nYour book now: " + element1);
        System.out.println("\nBooks left: " + books); 
		
	}

}
