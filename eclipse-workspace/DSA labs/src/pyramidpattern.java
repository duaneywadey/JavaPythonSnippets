
public class pyramidpattern {
	
	static void stairCase(int n) {
		for(int numSymbols = 1; numSymbols <= n; numSymbols++) {
			int numSpaces = n - numSymbols;
			
			for(int i=0; i<numSpaces; i++) {
				System.out.print(' ');
			}
			
			for(int k=0; k<numSymbols; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	
	
	 static void numberCountdown(int n) {
		 for(int k=n; k>=1; k--) {
				for(int j=k; j>=1; j--) {
					System.out.print(j);
				}
				System.out.println();
			}
		
	}
	

	public static void main(String[] args) {
		stairCase(5);
		
		
		

	}

}
