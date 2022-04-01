import java.util.Stack;

public class ProcessingNumbers {

	public static void main(String[] args) {
		Stack<String> nums= new Stack<>();  
		
		for(int q=0;q<10;q++){
				nums.push("paper" + Integer.toString(q));
		}
		System.out.println("List of all papers to be read: " + nums); 
		for(int l=0;l<=5;l++) {
			String paperToBeRead= nums.pop();	
		}
		System.out.println("Papers left: " + nums);
	}

}
