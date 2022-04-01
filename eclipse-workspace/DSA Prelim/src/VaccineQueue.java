import java.util.Queue;
import java.util.LinkedList;

public class VaccineQueue {
	public static void main(String[] args) {
		Queue<String> numbers = new LinkedList<>();
		for(int q=1;q<15;q++){
			numbers.offer("Person" + Integer.toString(q));
		}
		System.out.println("People in line for vaccine: " + numbers);
		for(int q=0; q<=4; q++) {
			String element = numbers.poll();
		}
		System.out.println("\nVaccinating the first five.....");
	    System.out.println("\nPeople left: " + numbers);
	    
	}
}
