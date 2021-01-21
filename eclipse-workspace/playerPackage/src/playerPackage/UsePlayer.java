package playerPackage;

public class UsePlayer {

	public static void main(String[] args) {
		Object[] objects = {new Child(), new Musician(), new Actor()};
		 for (int i = 0; i < objects.length; i++) {
		 if (objects[i] instanceof Player) {
			 System.out.println(((Player)objects[i]).myRole());
		 }
		
		 }

	}

}
