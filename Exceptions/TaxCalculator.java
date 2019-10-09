package Exceptions;

import javax.imageio.IIOException;

public class TaxCalculator {

	String empName;
	Boolean isIndian;
	int empSal;
	static int taxAmount;
	public static void main(String[] args) throws Exception,NullPointerException{
		calculateTax("jack",true,55000);
		System.out.println("tax amount"+taxAmount);
		try {
         calculateTax("Ron",false,34000);
         System.out.println("taxAmount is"+ " " +taxAmount);
	}
		catch(Exception e) {
			System.out.println("the employee should be  indian citizen for calculating tax");
		}
		try {
			calculateTax("tim",true,1000);
			System.out.println("tax amount"+taxAmount);
		}
		catch(Exception p) {
			System.out.println("the employee does not need pay tax");
		}
		try {
		   calculateTax(null,true,30000);
			System.out.println("tax amount"+" "+taxAmount);
		}
		catch(Exception n) {
			System.out.println("the employee name cannot be empty");
		}
		
	}	

public TaxCalculator(String empName, Boolean isIndian, int empSal) {
		super();
		this.empName = empName;
		this.isIndian = isIndian;
		this.empSal = empSal;
	}

public TaxCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static  int  calculateTax(String empName,Boolean isIndian,int empSal) throws Exception,NullPointerException {
		 if(isIndian !=true) {
			throw new IIOException("CountryNotValidException");
			
		}
		
		if(empName==null) {
			throw new NullPointerException("EmployeeNameInvalidException");
		}
		
		if(empSal>=100000 && isIndian==true) {
			taxAmount=empSal*8/100;
		}
		else if (empSal>=50000 && empSal<=100000 && isIndian==true){
			taxAmount= empSal*6/100;
		}
		else if (empSal>=30000 &&empSal<=50000 && isIndian==true){
			taxAmount= empSal*5/100;
		}
		else if (empSal>=10000 && empSal<=30000 && isIndian==true){
			taxAmount= empSal*4/100;
		}
		else {
			throw new Exception("TaxNotEligibleException");
		
		}
		return taxAmount;
		
		
	}                                                         
	
}
