package oopprojects;
import java.util.Scanner;

public class TestPizza  {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pizza order = new Pizza();
		System.out.println("Enter the topping: ");
		String topp = scan.nextLine();
		order.setToppings(topp);
		System.out.println("Enter the diameter: ");
		int diam = scan.nextInt();
		order.setDiameter(diam);
		System.out.println("Enter the price: ");
		double pr = scan.nextDouble();
		order.setPrice(pr);
		System.out.println("TOPPING: " + order.getToppings());
		System.out.println("DIAMETER: " + order.getDiameter());
		System.out.println("PRICE: " + order.getPrice());
		// User input
				double[] myList = new double[10];
				java.util.Scanner input = new java.util.Scanner(System.in);
				System.out.print("Enter " + myList.length + " values: ");
				for (int i = 0; i < myList.length; i++) {
				myList[i] = input.nextDouble();
				}
				
				// Printing an array
				for (int q=0; q<myList.length; q++) {
					System.out.println(myList[q]);
					
				}

	}

}
