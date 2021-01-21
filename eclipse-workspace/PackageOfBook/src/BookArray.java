import java.util.*;
public class BookArray {


	public static void main(String[] args) {
	String [] FictionBooks = {"Introduction to C++", "Python Crash Course", 
			"C# For Beginners", "Kotlin Tutorial", "Head First Java", "Discrete Mathematics", 
			"The Surgeon", "Percy Jackson", "Hunger Games", "IT"};
	
	String [] NonFictionBooks = {"Time Magazine", "Encyclopedia", "Biology", "Chemistry", "Zoology",
			"Tempo Newspaper", "Inquirer", "Genetics", "Biostatistics", "Statistics for Researchers"};
	
	System.out.println("FICTION BOOKS: ");
	for (int i=0; i<FictionBooks.length; i++) {
		System.out.println("\t" + FictionBooks[i]);
	}
	System.out.println("\nNON FICTION BOOKS: ");
	for (int j=0; j<NonFictionBooks.length; j++) {
		System.out.println("\t" + NonFictionBooks[j]);
	}
	}	
}
