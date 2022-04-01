import java.util.*;


public class arraymanips {
	
	public static int reverse(int x) {
		
		int rev = 0;
        while(x!=0)
        {   
            rev = rev * 10 + x%10;
            x/=10;
        }
        return rev;
	 }
	

	public static void main(String[] args) {
		System.out.println(reverse(6784));
		
		int myArray[] = {89,86,78,95};
		int sum = 0;
		
		for(int i=0; i<myArray.length; i++) {
			sum = sum + myArray[i];
		}
		
		int removeIndex = 2;
		
		for(int i=removeIndex; i<myArray.length-1; i++) {
			myArray[i] = myArray[i+1];
		}

	}
	

}
