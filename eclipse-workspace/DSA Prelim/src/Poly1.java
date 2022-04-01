





class Sports {
	
  public void SportsGear() {
    System.out.println("Equipments in the following sports: ");
  }
}

class Basketball extends Sports {
  public void SportsGear() {
    System.out.println("Ring and basketball");
  }
}

class Golf extends Sports {
  public void SportsGear() {
    System.out.println("Golf club and Golf balls");
  }
}

public class Poly1 {

	public static void main(String[] args) {
		Sports mySports = new Sports();  // Create a Sports object
	    Sports myBasketball = new Basketball();  // Create a Basketball object
	    Sports myGolf= new Golf();  // Create a Dog object
	    mySports.SportsGear();
	    myBasketball.SportsGear();
	    myGolf.SportsGear();

	}

}
