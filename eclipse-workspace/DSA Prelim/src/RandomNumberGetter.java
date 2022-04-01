import java.util.Stack;  
import java.util.Random;
public class RandomNumberGetter {

	public static void main(String[] args) {
		
		Stack<Integer> stk= new Stack<>();  
		
		for(int q=0;q<10;q++){
			  int random = (int)(Math.random()* (50 + 1));
			  stk.push(random);
		}
		System.out.println("List of available random numbers: " + stk); 
		int element1 = stk.pop();
		System.out.println("Getting the latest number...." + "\nYour number: " + element1);
        System.out.println("\nElements in Stack: " + stk); 

	}

}
