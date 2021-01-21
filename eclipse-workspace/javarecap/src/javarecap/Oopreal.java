package javarecap;
import java.util.Scanner;
import java.util.Random;
public class Oopreal {
	private String yourName;
	private String nameFruit;
	private double priceFirst;
	private int quantity;
	

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	Oopreal orderKo = new Oopreal("Saging");
	Oopreal orderKoa = new Oopreal("Saging nga");
	orderKo.printProduct();
	orderKoa.printProduct();
	int num = rand.nextInt(10);
	int value = timesTwo(num);
	System.out.println(value);
	System.out.println("Enter your age: ");
	int yourAge = scan.nextInt();
	int aging = twoTimes(yourAge);
	System.out.println("New age is " + aging);
	int questionage = question(aging);
	
	
	
	}
	public static int timesTwo(int num) {
		int doble = num*=2;
		return doble;
		
	}
	public Oopreal (String nameAgain) {
		this.yourName = nameAgain;
		this.nameFruit = nameFruit;
		this.priceFirst = 50;
		this.quantity = 2;
	
	}
	public void printPerson() {
		System.out.println("Hello " + this.yourName + " your age is " + this.yourAge);
	}
	
	static int twoTimes(int yourAge) {
		int tanda = yourAge * 2;
		return tanda;
		
	}
		
	
	public void printProduct() {
		System.out.println("Order details: " + this.nameFruit + "\nPrice: " + this.priceFirst
				+ "\nQuantity: " + this.quantity);
	}
	
	public static int question(int aging) {
		if (aging <= 60) {
			System.out.println("Young!");
		}
		else {
			System.out.println("Old!");
		}
		return aging;
		
	}
	

}
