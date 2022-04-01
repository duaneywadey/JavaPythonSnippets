import java.util.Queue;
import java.util.LinkedList;

public class PrinterQueue {

	public static void main(String[] args) {
		Queue<String> numbers = new LinkedList<>();
		for(int q=1;q<=10;q++){
			numbers.offer("Page" + Integer.toString(q));
		}
		System.out.println("Pages to be printed: " + numbers + "\nPrinting first 5 pages....");
		
		for(int a=0; a <=4; a++) {
			numbers.poll();
		}
		
		System.out.println("Done! " + "\n\nPages left: " + numbers);
		
		for(int b=5; b<=9; b++) {
			numbers.poll();
		}
		System.out.println("Printing another 5 pages.....\nAll Done! " + "\nPages left: " + numbers);
		
	}
}
