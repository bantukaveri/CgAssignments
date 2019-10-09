package Interface;

public class AdultUsers implements LibaryUsers{
	
	int age;
	String bookType;

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age>12)
		{
			System.out.println("You have successfully registered under a adult account");
		}
		else
		{
			System.out.println("sorry, age must be greater than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType=="Fiction" )
		{
			System.out.println("booked issued successfully, please return the book with in 7 days");
	}
		else {
			System.out.println("oops, you are allowed to take only adult fiction book");
		}

	}

}
