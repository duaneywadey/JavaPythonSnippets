package livingBeings2;

public class MainBeings extends Mammal {

	public static void main(String[] args) {
		Mammal human1 = new Mammal();
		Mammal dog1 = new Mammal();
		Mammal cat1 = new Mammal();
		human1.setName("Dru");
		dog1.setName("Dogie");
		cat1.setName("Caty");
		System.out.println(human1.printInformation()+ ", a human being");
		System.out.println(dog1.printInformation()+ ", a dog");
		System.out.println(cat1.printInformation() + ", a cat");
	}

}
