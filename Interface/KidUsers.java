package Interface;

public class KidUsers implements LibaryUsers{
	
	int age;
	String bookType;

	@Override
	public void registerAccount() {
	
		if(age<12)
		{
			System.out.println("You have successfully registered under a kids account");
		}
		else
		{
			System.out.println("sorry, age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType=="kids" )
		{
			System.out.println("booked issued successfully, please return the book with in 10 days");
	}
		else {
			System.out.println("oops, you are allowed to take only kids book");
		}


}}