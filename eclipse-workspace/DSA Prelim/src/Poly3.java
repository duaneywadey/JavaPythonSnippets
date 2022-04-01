
class boxing {
	 public void boxersDescription() {
		    System.out.println("Boxers: ");
		  }
	 
}

class Heavyweight extends boxing {
	  public void boxersDescription() {
	    System.out.println("200 lbs above");
	  }
	  
}

class HeavyweightInPH extends boxing{
	  public void boxersDescription() {
		    System.out.println("Heavyweight in PH: 200 lbs above");
		  }
	  
	  
}
	  

class Lightweight extends boxing {
		  public void boxersDescription() {
		    System.out.println("130-135lbs");
		  }
	  

	}

class LightweighttInPH extends boxing{
	  public void boxersDescription() {
		    System.out.println("Lightweight in PH: 130-135lbs");
		  }
	  
	  
}




public class Poly3 {

	public static void main(String[] args) {
		boxing myBoxing = new boxing();
		Heavyweight myHeavy = new Heavyweight();
		Lightweight myLight = new Lightweight();
		HeavyweightInPH myHeavyPH = new HeavyweightInPH();
		myBoxing.boxersDescription();
		myLight.boxersDescription();
		myHeavy.boxersDescription();
		myHeavyPH.boxersDescription();
		
		
	}
		

	}


