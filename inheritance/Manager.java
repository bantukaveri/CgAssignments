package inheritance;

public class Manager extends Employee{
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}

	  public void calculateTransportAllowance() {
		  double transportAllowance = 15*basicSalary /100; 
		  System.out.println(transportAllowance);

	  }
	
}
