package ooppractice;

public class Tao {
	private String name;
	private int age;
	private String gender;
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Tao oat = new Tao();
		oat.setName("Duaney Wadey");
		System.out.println(oat.getName());
		oat.setGender("Male");
		System.out.println(oat.getGender());
		oat.setAge(20);
		System.out.println(oat.getAge());
		
		}

}
