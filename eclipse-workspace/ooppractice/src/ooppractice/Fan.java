package ooppractice;
import java.util.*;

public class Fan {
	String brand;
	String modelCode;
	int rating;
	int yearBought;
	int motorSpeed;
	
	public Fan(String brand, String modelCode, int rating, int yearBought, int motorSpeed) {
		this.brand = brand;
		this.modelCode = modelCode;
		this.rating = rating;
		this.yearBought = yearBought;
		this.motorSpeed = motorSpeed;
		
	}
	public String showBrand(String brand) {
		return this.brand;
		
	}
	public String showCode(String modelCode) {
		return this.modelCode;
		
	}
	public int showRating (int rating) {
		return this.rating;
	}
	public int showMotorSpeed(int motorSpeed) {
		if (motorSpeed == 1) {
			System.out.println("Slow");
		}
		else if (motorSpeed == 2){
			System.out.println("Moderate");
		}
		else if (motorSpeed == 3){
			System.out.println("Fast");
		}
		return this.motorSpeed;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Fan sample = new Fan("Hanabishi", "fe35g3778s", 2, 2019, 2);
		System.out.println("Motor Speed: " + sample.showMotorSpeed(sample.motorSpeed));
		
		

	}

}
