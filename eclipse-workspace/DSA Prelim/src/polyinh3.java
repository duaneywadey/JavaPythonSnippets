class communityWorkers {
	
	public void responsibility() {
		System.out.println("To work for the community");
	}
	public void personality(){
		System.out.println("hardworking people");
		}  

	public void task() {
		System.out.println("Different jobs");
		
	}
		
	
}

class Doctor extends communityWorkers{  
	
	public void responsibility() {
		System.out.println("To heal the sick");
	}
	public void personality(){
		System.out.println("caring and hardworking people");
		}  

	public void task() {
		System.out.println("Perform medical treatment");
		
	}
}  

class Soldier extends communityWorkers{  
	
	public void responsibility() {
		System.out.println("Fight for peace and security");
	}
	public void personality(){
		System.out.println("brave and hardworking people");
		}  

	public void task() {
		System.out.println("Perform millitary operations");
		
	}
}  

class Lawyer extends communityWorkers{  
	
	public void responsibility() {
		System.out.println("Fight for justice");
	}
	public void personality(){
		System.out.println("smart and hardworking people");
		}  

	public void task() {
		System.out.println("Defend a lawsuit");
		
	}
}  

public class polyinh3 {

	public static void main(String[] args) {
		 communityWorkers com = new communityWorkers();
		 Doctor d = new Doctor();
		 Soldier s = new Soldier();
		 Lawyer l = new Lawyer();
		 d.personality();
		 d.responsibility();
		 d.task();
		 
		

	}

}
