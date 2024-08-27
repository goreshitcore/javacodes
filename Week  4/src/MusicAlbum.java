
public class MusicAlbum {
	public String title;
	public String artist;
	public String genre;
	public int numberOfTracks;
	
    public MusicAlbum(String title, String artist, String genre, int numberOfTracks) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.numberOfTracks = numberOfTracks;
    }
    
    public void displayAlbumInfo() {
        System.out.println("Title = " + title);
        System.out.println("Artist = " + artist);
        System.out.println("Genre = " + genre);
        System.out.println("Number of Tracks = " + numberOfTracks);
    }
	public static void main (String[] args) {
		 MusicAlbum album1 = new MusicAlbum("Thriller", "Michael Jackson", "Pop", 9);
	   
	        album1.displayAlbumInfo();
	        System.out.println(); 
	}
}