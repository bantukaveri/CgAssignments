package abstraction;

public class CD extends MediaItem {

	public CD(int runTime) {
		super(runTime);
		// TODO Auto-generated constructor stub
	}
  private String artist;
 private String genre;
public CD(int runTime, String artist, String genre) {
	super(runTime);
	this.artist = artist;
	this.genre = genre;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
 
 
	
}
