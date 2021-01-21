package ooppractice;
import java.util.*;


public class aaa {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 ArrayList<Integer> score= new ArrayList<Integer>(); 
         int alice[] = new int[3];
				int bob[] = new int[3];
				 System.out.println("enter elements");

			        for(int i=0;i<alice.length;i++){//for reading array
			            alice[i]=scan.nextInt();

			        }
			        System.out.println("enter elements");
			        for(int j=0;j<bob.length; j++) {
			        	bob[j]=scan.nextInt();
		        }
		        System.out.println("Alice");
			        for(int pr:alice) {
			        	System.out.println(pr);
			        }
			           System.out.println("\nBob");
			        for(int pr:bob) {
			        	System.out.println(pr);
			        }
			        int scoreAlice=0;
			        int scoreBob=0;
			     if(alice[0]>bob[0]) {
			    	 scoreAlice+=1;
			    	 
			     }
			     if (bob[0]>alice[0]) {
			    	 scoreBob+=1;
			    	 
			     }
			     if(alice[1]>bob[1]) {
			    	 scoreAlice+=1;
			    	 
			     }
			     if (bob[1]>alice[1]) {
			    	 scoreBob+=1;
			    	 
			     }
			     if(alice[2]>bob[2]) {
			    	 scoreAlice+=1;
			    	 
			     }
			     if (bob[2]>alice[2]) {
			    	 scoreBob+=1;
			    	 
			     }
			     System.out.println("Alice's score: "  + scoreAlice);
			     System.out.println("Bob's score: " + scoreBob);
			     score.add( scoreBob);
			     score.add(scoreAlice);
			     System.out.println(score);
			    
}

	 
}
	