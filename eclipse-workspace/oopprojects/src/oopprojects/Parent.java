package oopprojects;

public class Parent {
	String studentName;
	String studentGender;
	int studentAge;
	int accBalance;
	int moneyAdded;
	
	public Parent(String studentName, String studentGender, int studentAge) {
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentAge = studentAge;
	}
	
	public void setName(String studentName) {
		this.studentName = studentName;
	}
	
	public String showName() {
		return studentName;
	}
	public int showAge() {
		return studentAge;
	}
	public String showGender() {
		return studentGender;
		
	}
	

	public static void main(String[] args) {
		System.out.println("Hello");

	}

	public void setBalance(int accBalance) {
		this.accBalance = accBalance;
		
	}
	public int getBalance() {
		return accBalance;
	}
	public void setDeposit(int moneyAdded) {
		this.moneyAdded = moneyAdded;
	}
	public int getAdd() {
		return moneyAdded;
		
	}
	public int addedBalance() {
		int add = moneyAdded + accBalance;
		return add;
	}
	
}
