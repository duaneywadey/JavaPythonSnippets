


class poly
	{
		public void display()
			{
				System.out.println("This is the example of polymorphism");
			}
		public void display(String name)
			{
				System.out.println("Name	:"+name);
			}
		public void display(String name,int age)
			{				
				System.out.println("Name	:"+name);
				System.out.println("Age	:"+age);
			}
		public void display(String name,int age,String city)
			{				
				System.out.println("Name	:"+name);
				System.out.println("Age	:"+age);				
				System.out.println("City	:"+city);
			}
		public void display(String name,int age,String city,int roll)
			{				
				System.out.println("Name	:"+name);
				System.out.println("Age	:"+age);			
				System.out.println("City	:"+city);
				System.out.println("Roll	:"+roll);
			}
	}


public class poly4 {

	public static void main(String[] args) {
		poly obj1=new poly();
		poly obj2=new poly();
		poly obj3=new poly();
		poly obj4=new poly();
		poly obj5=new poly();

		obj1.display();
		obj2.display("Ivan");
		obj3.display("Ivan",21);
		obj4.display("Ivan",21,"Cavite");
		obj5.display("Ivan",21,"Cavite",001);	
		

	}

}
