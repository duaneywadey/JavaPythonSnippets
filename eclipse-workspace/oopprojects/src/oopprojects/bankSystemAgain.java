package oopprojects;

public class bankSystemAgain extends Parent {
	int accBalance;

	public bankSystemAgain(String studentName, String studentGender, int studentAge) {
		super(studentName, studentGender, studentAge);
		
	}
	

	public static void main(String[] args) {
		Parent obj1 = new Parent("Duaney", "Male", 19);
		obj1.setName("Duaney");
		System.out.println(obj1.showName());
		System.out.println(obj1.showAge() + " " + obj1.showGender() );
		obj1.setBalance(200000);
		System.out.println("BALANCE: " + obj1.getBalance());
		obj1.setDeposit(24536);
		System.out.println(obj1.getAdd() + " PESOS HAS BEEN ADDED TO YOUR ACCOUNT");
		System.out.println("\nNEW BALANCE: " + obj1.addedBalance());
	}

}
