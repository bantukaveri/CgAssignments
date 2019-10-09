package inheritance;

public class Trainee extends Employee {
	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}
	 
}
