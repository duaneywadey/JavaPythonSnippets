import java.util.LinkedList;

public class JoinAll {

	public static void main(String[] args) {
		// create an empty linked list
		  LinkedList <String> c1 = new LinkedList <String> ();
		  
		          c1.add("Blues");
		          c1.add("Rock and Roll");
		          c1.add("Folk");
		          c1.add("Country");
		          c1.add("Soul");
		          System.out.println("List of first linked list: " + c1);
		         LinkedList <String> c2 = new LinkedList <String> ();
		          c2.add("Pop");
		          c2.add("EDM");
		          c2.add("HipHop");
		          c2.add("Dance");
		          System.out.println("List of second linked list: " + c2);
		        
		      // Let join above two list
		        LinkedList <String> a = new LinkedList <String> ();
		        a.addAll(c1);
		        a.addAll(c2);
		        System.out.println("Joined as one: " + a);
		             }
	
	}


