package enumerators;

public enum TestEnum {
	ENGINEER(20000), DOCTOR(30000), LAWYER(100000), PROFESSOR(25000), NURSE(15000);
	int salary;
	
	TestEnum(int salary){
		this.salary = salary;
	}
}
