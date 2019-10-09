package abstraction;

public class JournalPaper extends WrittenItem {
	private int yearOfPublish;

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public JournalPaper(int idNumber, String title, int noOfCopies) {
		super(idNumber, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}

	

	
	
}
