


class musicGenres {
	
  public void artists() {
    System.out.println("Artists in the following genres: ");
  }
}

class HipHop extends musicGenres {
  public void artists() {
    System.out.println("Eminem and Tupac");
  }
}

class Rock extends musicGenres {
	  public void artists() {
	    System.out.println("The Beatles and Rolling Stones");
	  }
	}


public class Poly2 {

	public static void main(String[] args) {
		musicGenres mymusicGenres = new musicGenres();  // Create a musicGenres object
	    musicGenres myHiphop = new HipHop();  // Create a Hiphop object
	    musicGenres myRock= new Rock();  // Create a Dog object
	    mymusicGenres.artists();
	    myHiphop.artists();
	    myRock.artists();
		
		
	

	}

}
