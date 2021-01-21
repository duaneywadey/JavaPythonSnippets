
public abstract class Book {
	String bookTitle;
	double bookPrice;
	

	public Book(String Title) {
		bookTitle = Title;
	}
	
	public String getTitle() {
		return bookTitle;
		
	}
	public double getPrice() {
		return bookPrice;
	}
	
	public abstract void setPrice();

	public void setPrice(double bookPrice) {
		this.bookPrice = bookPrice;
		
	}


}
