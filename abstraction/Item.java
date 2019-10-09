package abstraction;

public abstract class Item {
    
	private int idNumber;
	private String title;
	private int noOfCopies;
	public Item() {
		super();
		idNumber=0;
		title=" ";
		 noOfCopies=0;
	}
	public Item(int idNumber, String title, int noOfCopies) {
		super();
		this.idNumber = idNumber;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	@Override
	public String toString() {
		return "Item [idNumber=" + idNumber + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idNumber;
		result = prime * result + noOfCopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (idNumber != other.idNumber)
			return false;
		if (noOfCopies != other.noOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
 public void checkIn() {
	 noOfCopies = noOfCopies+1;
 }
 public void checkOut() {
	 noOfCopies = noOfCopies-1;
 }
 //public void addItem() {
//	 super.addItem();
// }
}
