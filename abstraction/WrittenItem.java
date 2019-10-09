package abstraction;

public class WrittenItem extends Item {

	
	private String Author;
	
	public WrittenItem(int idNumber, String title, int noOfCopies) {
		super(idNumber, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}




	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WrittenItem []";
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	
}
