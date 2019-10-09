package Interface;

public class LibaryUsersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KidUsers  kd = new KidUsers ();
	            kd.age=10;
	            kd.registerAccount();
	            
	            kd.age=18;
	            kd.registerAccount();
	            
	            kd.bookType="kids";
	            kd.requestBook();
	            
	            
	            kd.bookType="fiction";
	            kd.requestBook();
	              
	            
	           
	            
	            AdultUsers au= new  AdultUsers();
	            
	            au.age=5;
	            au.registerAccount();
	            
	            au.age=18;
	            au.registerAccount();
	            
	            au.bookType="kids";
	            au.requestBook();
	            
	            
	            au.bookType="fiction";
	            au.requestBook();
            
	}

}
