
public class DemoBook extends Textbook{

	public static void main(String[] args) {
		Textbook book1 = new Textbook();
		book1.setBookTitle("Buhay ni Tatang Florante");
		System.out.println("BOOK TITLE: " + book1.getBookTitle());
		book1.setnumberOfPages(546);
		System.out.println("NUMBER OF PAGES: " + book1.getnumberOfPages());
		book1.setGradeLevel(10);
		System.out.println("GRADE LEVEL: " + book1.getGradeLevel());
		
	}

}
