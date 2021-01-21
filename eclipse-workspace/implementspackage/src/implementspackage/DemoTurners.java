package implementspackage;

public class DemoTurners {

	public static void main(String[] args) {
		Object[] objects = {new Leaf(), new Page(), new Pancake()};
		 for (int i = 0; i < objects.length; i++) {
		 if (objects[i] instanceof Turner) {
			 System.out.println(((Turner)objects[i]).turn());
		 }
		
		 }
	

	}

}
