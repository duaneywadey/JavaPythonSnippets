
public class main {

	public static void main(String[] args) {
		SinglyLinkedList<String> MyList = new SinglyLinkedList<String>();
		MyList.addFirst("1");
		MyList.addFirst("2");
		MyList.addFirst("3");
		MyList.addFirst("4");
		MyList.addLast("5");
		MyList.addLast("6");
		MyList.addLast("7");
		MyList.addLast("8");
		while(!MyList.isEmpty()) {
			MyList.removeFirst();
		}
	}
	
	
}
