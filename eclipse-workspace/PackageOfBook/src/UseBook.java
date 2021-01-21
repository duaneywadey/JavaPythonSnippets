
public class UseBook {
	

	public static void main(String[] args) {
	
	Book b1 = new Fiction("Narnia");
	Book b2 = new NonFiction("Time Magazine");
	b1.setPrice();
	b2.setPrice();
	
	System.out.println("FICTION TITLE: " + b1.getTitle());
	System.out.println("PRICE " + b1.getPrice());
	System.out.println("\nNON FICTION TITLE: " + b2.getTitle());
	System.out.println("PRICE: " + b2.getPrice());

	

	}

}
