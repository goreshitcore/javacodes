public class Album {
    private String title;
    private String artist;
//constructor
    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
//get title
    public String getTitle() {
        return this.title = title;
    }
    
    public String getArtist() {
        return this.artist = artist;
    }
//set title
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
       
    }

    public static void main(String[] args) {
        Album ba = new Album("Good Tunes", "Great Artist");
        System.out.println("Title: " + ba.getTitle());
        System.out.println("Artist: " + ba.getArtist());

        ba.setTitle("Great Tunes");
        ba.setArtist("Better Artist");

        System.out.println("Title: " + ba.getTitle());
        System.out.println("Artist: " + ba.getArtist());
    }
}