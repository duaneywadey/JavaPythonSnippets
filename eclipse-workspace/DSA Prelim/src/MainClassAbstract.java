
abstract class Vehicle {
  public abstract void vehicleSound();
  
  // Two functions for the abstract class Vehicle
  
  public void refillGas() {
    System.out.println("Refill");
  }
  
  public void startEngine() {
	    System.out.println("Start");
	  }
  
}


// Car class
class Car extends Vehicles {
  public void vehicleSound() {
 
    System.out.println("Car sound");
  }
}

// Bus class
class Bus extends Vehicles {
	public void vehicleSound() {
	System.out.println("Bus sound");
}
}


class MainClassAbstract {

	public static void main(String[] args) {
		
		// Creating an object from Car and Bus classes 
		
		Car myCar = new Car();
		Bus myBus = new Bus();
	    myCar.vehicleSound();
	    myBus.vehicleSound();
		
	}
}
