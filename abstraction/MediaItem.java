package abstraction;

public abstract class MediaItem {

	@Override
	public String toString() {
		return "MediaItem []";
	}

	int runTime;

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public MediaItem(int runTime) {
		super();
		this.runTime = runTime;
	}
	
	
}
