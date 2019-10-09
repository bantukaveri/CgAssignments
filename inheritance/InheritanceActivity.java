package inheritance;

public class InheritanceActivity {
	public static void main(String agrs[]) {
	  //Employee e = new Employee();
	  
	
	 Manager m= new Manager(12634,"peter","chennai india",23744,65000);
	 
	 m.calculateSalary();
	 
	 m.calculateTransportAllowance();
			 
	 Trainee t= new Trainee(29846,"jack","mumbai india",442085,45000);
	  
	 t.calculateSalary();
	
     t.calculateTransportAllowance();
     
}
}