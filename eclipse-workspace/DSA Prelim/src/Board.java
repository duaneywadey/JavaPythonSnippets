import java.util.ArrayList;

public class Board {

	public static void main(String[] args) {
		  ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		  
		    myNumbers.add(33);
		    myNumbers.add(15);
		    myNumbers.add(20);
		    myNumbers.add(34);
		    myNumbers.add(8);
		    myNumbers.add(12);
		    myNumbers.add(74);
		    myNumbers.add(58);
		    myNumbers.add(22);
		    
		    int firstDiagonal=0;
		    int secondDiagonal=0;
		    
		    for(int k=0; k<myNumbers.size(); k++) {
		    	firstDiagonal += myNumbers.get(k);
		    	System.out.println(firstDiagonal);
		    	
		    }

	
		}
}


