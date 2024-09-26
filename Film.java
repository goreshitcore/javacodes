
public class Film extends Media {
	    private String stars;

	    // Constructor to initialize both instance variables with the input parameters
	    public Film(String title, String stars) {
	        super(title);  // Calls the constructor of Media
	        this.stars = stars;
	    }

	    // Get method for stars
	    public String getStars() {
	        return stars;
	    }

	    // toString method for Film
	    @Override
	    public String toString() {
	        return super.toString() + " Stars: " + stars;
	    }

	    // Method to count the number of stars in the Film
	    public int numberOfStars() {
	        String[] starArray = stars.split(",");
	        return starArray.length;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
