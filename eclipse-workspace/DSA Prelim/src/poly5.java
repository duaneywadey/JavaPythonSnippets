import java.util.Scanner;

class myCar {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    myCar() {}

    public myCar(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("myCar Engine Started");
    }

    public void accelerate() {
        System.out.println("myCar Accelerated");
    }

    public void brake() {
        System.out.println("myCar Stopped, brakes applied");
    }
}

 class Lambo extends myCar {

    public Lambo(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Lambo Creta started");
    }

    @Override
    public void accelerate() {
        System.out.println("Lambo Creta Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Lambo Creta stopped, Brakes applied");
    }

}
 
 class Cheetah extends myCar {

	    public Cheetah(String name, int cylinders) {
	        super(name, cylinders);
	    }

	    @Override
	    public void startEngine() {
	        System.out.println("Cheetah Alto started");
	    }

	    @Override
	    public void accelerate() {
	        System.out.println("Cheetah Alto Accelerated");
	    }

	    @Override
	    public void brake() {
	        System.out.println("Cheetah Alto stopped, Brakes applied");
	    }

	}
 
 class AMW extends myCar {

	    public AMW(String name, int cylinders) {
	        super(name, cylinders);
	    }

	    @Override
	    public void startEngine() {
	        System.out.println("AMW Safari started");
	    }

	    @Override
	    public void accelerate() {
	        System.out.println("AMW Safari Accelerated");
	    }

	    @Override
	    public void brake() {
	        System.out.println("AMW Safari stopped, Brakes applied");
	    }

	}
public class poly5 {

	public static void main(String[] args) {
		
		 myCar myCar ;
	        System.out.println("Functions of a myCar: ");
	        (new myCar()).startEngine();
	        (new myCar()).accelerate();
	        (new myCar()).brake();
	        System.out.println();

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("1-Lambo creta\n2-Cheetah Alto\n3-AMW Safari");
	        System.out.println("Enter your choice: ");
	        int ch = scanner.nextInt();

	        switch(ch) {

	            case 1: myCar = new Lambo("Creta", 4);
	                System.out.println(myCar.getName() + " has " + myCar.getCylinders() + " cylinders.");
	                myCar.startEngine();
	                myCar.accelerate();
	                myCar.brake();
	                break;

	            case 2: myCar = new Cheetah("Alto", 2);
	                System.out.println(myCar.getName() + " has " + myCar.getCylinders() + " cylinders.");
	                myCar.startEngine();
	                myCar.accelerate();
	                myCar.brake();
	                break;

	            case 3: myCar = new AMW("Safari", 6);
	                System.out.println(myCar.getName() + " has " + myCar.getCylinders() + " cylinders.");
	                myCar.startEngine();
	                myCar.accelerate();
	                myCar.brake();
	                break;

	                default:
	                    System.out.println("Enter Valid Choice.");

		

	}

}

}