
public class fibonacci {
	
	static int fib(int n)
    {
    if (n <= 1) {
    	return n;
    }
    return fib(n-1) +(n-2);
 
    }
	
	  static void plusMinus(int[] arr) {
	        int multipleOfThree = 0;
	        int multipleOfSeven = 0;
	        int othersCount = 0;
	        
	        for(int n:arr){
	            if(n%3==0){
	                multipleOfThree++;
	            }
	            else if(n%7==0){
	                multipleOfSeven++;
	            }
	          else {
	            othersCount++;
	            
	          }
	            
	            
	        }
	        System.out.println(multipleOfThree);
	        System.out.println(multipleOfSeven);
	        System.out.println(othersCount);
	    }
	  
	  static void checkLetters(String[]arrString) {
		  int checkA = 0;
		 
		  for(int k=0; k < arrString.length; k++) {
			  for(int j=k+1; j<arrString.length; j++) {
				  if(arrString[k]==arrString[j]) {
					  checkA++;
					  System.out.println("There is");
					  return;
				  } 
				  
				  
			  }
			   
		  }
		  
	  }
	  static void checkDup(String[]a) {
		  int checker=0;
		  for(int i = 0; i < a.length;i++) {
			    for (int j = i + 1 ; j < a.length; j++) {
			        if (a[i] == a[j]) {
			        	
			            System.out.println("Found duplicate");
			            return;
			        }
			    }
			}
			System.out.println("No duplicate Found");
	  }
	            
	
	 

	public static void main(String[] args) {

		final String arrS[] = {"apple", "banana", "pineapple", "apple"};
		checkDup(arrS);

	}

}
