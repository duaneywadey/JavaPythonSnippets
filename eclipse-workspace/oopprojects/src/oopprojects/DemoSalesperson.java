package oopprojects;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DemoSalesperson   {
	Random rand = new Random();
	static int randomIDnumber = ThreadLocalRandom.current().nextInt(111, 120); 
	static int randomValue = ThreadLocalRandom.current().nextInt(25000, 70000);

	public static void main(String[] args) {
		  Salesperson[] arr1; 
		  Salesperson[] arr2;
		  Salesperson[] arr3;
		  Salesperson[] arr4;
		  Salesperson[] arr5;
		  Salesperson[] arr6;
		  Salesperson[] arr7;
		  Salesperson[] arr8;
		  Salesperson[] arr9;
		  Salesperson[] arr10;
		  arr1 = new Salesperson[2];
		  arr2 = new Salesperson[2];
		  arr3 = new Salesperson[2];
		  arr4 = new Salesperson[2];
		  arr5 = new Salesperson[2];
		  arr6 = new Salesperson[2];
		  arr7 = new Salesperson[2];
		  arr8 = new Salesperson[2];
		  arr9 = new Salesperson[2];
		  arr10 = new Salesperson[2];
		  
		  //EXAMPLE
		  arr1[0] = new Salesperson(111, randomValue); 
		  arr1[0].displayAll();
		  arr2[0] = new Salesperson(112, randomValue); 
		  arr2[0].displayAll();
		  arr3[0] = new Salesperson(113, randomValue); 
		  arr3[0].displayAll();
		  arr4[0] = new Salesperson(114, randomValue); 
		  arr4[0].displayAll();
		  arr5[0] = new Salesperson(115, randomValue); 
		  arr5[0].displayAll();
		  arr6[0] = new Salesperson(116, randomValue); 
		  arr6[0].displayAll();
		  arr7[0] = new Salesperson(117, randomValue); 
		  arr7[0].displayAll();
		  arr8[0] = new Salesperson(118, randomValue); 
		  arr8[0].displayAll();
		  arr9[0] = new Salesperson(119, randomValue); 
		  arr9[0].displayAll();
		  arr10[0] = new Salesperson(120, randomValue); 
		  arr10[0].displayAll();
		 	   
	}
	
	
	
}

class Salesperson {
	int IDnumber;
	int annualSalesAmount;
	

	public Salesperson(int IDnumber, int annualSalesAmount) {
		this.IDnumber = IDnumber;
		this.annualSalesAmount = annualSalesAmount;
	
	}
	public void displayAll() { 
	    System.out.println("\nID number: " + IDnumber + "\nAnnual sales amount: $" + annualSalesAmount);
	    System.out.println(); 
	} 


}



