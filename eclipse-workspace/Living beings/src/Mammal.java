

public class Mammal {
	String name;
	
	 public void setName(String name) {
		  this.name = name;
	  }
	
	  public String printInformation() {
		return name;
	}
		
	}
	class Human extends Mammal  {
	  public String printInformation() {
	    return name + ", a human";
	  }
	}

	class Dog extends Mammal {
	  public String printInformation() {
	    return name + ", a dog";
	  }
	}
	
	class Cat extends Mammal {
		  public String printInformation() {
		   return name + ", a cat";
		  }
	

	

	public static void main(String[] args) {
		Mammal human1 = new Mammal();
		Mammal dog1 = new Mammal();
		Mammal cat1 = new Mammal();
		human1.setName("Etnad");
		dog1.setName("Dogie");
		cat1.setName("Caty");
		System.out.println(human1.printInformation());
		System.out.println(dog1.printInformation());
		System.out.println(cat1.printInformation());
		
		
		
	}
	}
