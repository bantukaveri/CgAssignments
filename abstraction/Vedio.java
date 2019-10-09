package abstraction;

public class Vedio extends MediaItem{
	
	String director;
	String gerne;
	String yearOfRelease;

	public Vedio(int runTime) {
		super(runTime);
		// TODO Auto-generated constructor stub
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGerne() {
		return gerne;
	}

	public void setGerne(String gerne) {
		this.gerne = gerne;
	}

	public String getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public Vedio(int runTime, String director, String gerne, String yearOfRelease) {
		super(runTime);
		this.director = director;
		this.gerne = gerne;
		this.yearOfRelease = yearOfRelease;
	}

	
	
}
