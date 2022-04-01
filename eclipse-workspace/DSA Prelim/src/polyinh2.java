
class Animal{  	
public void breathing() {
	System.out.println("A breathing animal");
}
public void eat(){
	System.out.println("animal eating...");
	}  
}  

class Dog extends Animal{  
	
	public void breathing() {
		System.out.println("Breathing dog");
	}
	public void eat(){
		System.out.println("dog eating...");
		}  

	public void sound(){
	System.out.println(" dog barking...");
	}  
}  

class Cat extends Animal{  
	
	public void breathing() {
		System.out.println("Breathing cat");
	}
	public void eat(){
		System.out.println("cat eating...");
		}  

	
 public void sound(){
	System.out.println(" cat meowing...");
	}  
}  

class Snake extends Animal{  
	
	public void breathing() {
		System.out.println("Breathing snake");
	}
	public void eat(){
		System.out.println("snake eating...");
		}  

	
 public void sound(){
	System.out.println(" snake hissing...");
	}  
}  

class Cow extends Animal{  
	
	public void breathing() {
		System.out.println("Breathing cow");
	}
	public void eat(){
		System.out.println("cow eating...");
		}  

	
 public void sound(){
	System.out.println(" mooo...");
	}  
} 
public class polyinh2 {
	public static void main(String[] args) {
		Dog brownie=new Dog();  
		Cat mimi = new Cat();
		Cow c = new Cow();
		Snake s = new Snake();
		mimi.breathing();
		mimi.sound();
		c.breathing();
		c.sound();
		
	}

}
