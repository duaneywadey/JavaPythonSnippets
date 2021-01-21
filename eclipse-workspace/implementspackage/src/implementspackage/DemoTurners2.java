package implementspackage;

public class DemoTurners2 {

	public static void main(String[] args) {
		Object[] objects = {new Leaf(), new Page(), new Pancake(), 
				new boxingGloves(), new basketballHoop()};
		 for (int i = 0; i < objects.length; i++) {
		 if (objects[i] instanceof Turner) {
			 System.out.println(((Turner)objects[i]).turn());
		 }
		
		 }
	}	
		
	}

	 class basketballHoop implements Turner {

			@Override
			public String turn() {
				return "Woop! woop!";
			}
			
	}
	 class boxingGloves implements Turner {

			@Override
			public String turn() {
				return "Punch! punch!";
			}

}
