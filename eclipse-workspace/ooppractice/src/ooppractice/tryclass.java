package ooppractice;

public class tryclass {
	public static String dogName;
	public static int dogAge;
	public static String dogColor;
	public static String breed;
	
	public tryclass () {
		tryclass.dogName = "Dogie";
		tryclass.dogAge = 7;
		tryclass.dogColor = "Black";
		tryclass.breed = "German Sheperd";
		
	}
	  static void name(String dogName) {
		 System.out.println("Hi my name is " + dogName);
	 }
	  static void age(int dogAge) {
		 System.out.println("Hi I'm already " + dogAge);
	 }
	  static void nameBreed () {
		 System.out.println("My breed is " + breed);
	 }
	 
	public static void main(String[] args) {
		tryclass cutie = new tryclass();
		tryclass cutie2= new tryclass();
		tryclass.name(dogName);
		tryclass.age(dogAge);
	

	}

}


