package inheritance;

public class Employee {
	long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance=250.80;
    double hra=1000.50;

	
     	public void calculateSalary() {
        	double  salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
         System.out.println(salary);
          }
         public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
				double basicSalary, double specialAllowance, double hra) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeAddress = employeeAddress;
			this.employeePhone = employeePhone;
			this.basicSalary = basicSalary;
			this.specialAllowance = specialAllowance;
			this.hra = hra;
		}
		public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
				double basicSalary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeAddress = employeeAddress;
			this.employeePhone = employeePhone;
			this.basicSalary = basicSalary;
		}



		public Employee() {
			// TODO Auto-generated constructor stub
		}
	
	  public void calculateTransportAllowance() {
		  double transportAllowance = 10*basicSalary/100;
		  System.out.println(transportAllowance);

	  }
	

}
