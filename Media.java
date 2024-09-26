
public class Media {
	
	    private String title;
	    // Constructor to initialize title with an input parameter
	    public Media(String title) {
	        this.title = title;
	    }

	    // Get method for title
	    public String getTitle() {
	        return title;
	    }

	    // toString method for Media
	    @Override
	    public String toString() {
	        return "Title: " + title;
	    }
	    
	public static void main(String[] args) {
		Film film = new Film("My Film","bob, arnold, betty,alice");
		System.out.println("Testing numberOfStars method: "+film.numberOfStars());
	}

}
