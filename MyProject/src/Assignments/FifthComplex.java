package Assignments;

public class FifthComplex {
 double real , imaginary;
 
 
 FifthComplex  (double r, double i){
	this.real = r;
	this.imaginary  = i;
   }
 
 public static FifthComplex sum(  FifthComplex c1,  FifthComplex c2)
 {
	
	 FifthComplex fc = new FifthComplex(0, 0);
     fc.real = c1.real + c2.real;
     fc.imaginary = c1.imaginary + c2.imaginary;
     return fc;
  }
 
 public static FifthComplex sub(  FifthComplex c1,  FifthComplex c2)
 {
	
	 FifthComplex d = new FifthComplex(0, 0);
     d.real = c1.real - c2.real;
     d.imaginary = c1.imaginary - c2.imaginary;
     return d;
  }
 
 public static FifthComplex mul(  FifthComplex c1,  FifthComplex c2)
 {
	
	 FifthComplex m = new FifthComplex(0, 0);
     m.real = c1.real * c2.real;
     m.imaginary = c1.imaginary * c2.imaginary;
     return m;
  }
 public static FifthComplex swap(  FifthComplex c1,  FifthComplex c2)
 {
	 FifthComplex s = new FifthComplex(0, 0);
	
	 return c2;
 
 }
public static void main(String args[]) {
	FifthComplex c1 = new FifthComplex(5.5, 4);
	FifthComplex c2 = new FifthComplex(1.2, 3.5);
	FifthComplex fc = sum(c1, c2);
	FifthComplex d= sub(c1,c2);
	FifthComplex m= mul(c1,c2);
        System.out.println("Sum is: "+ fc.real+" + "+ fc.imaginary +"i");
        System.out.println("Sub is: "+ d.real+" + "+ d.imaginary +"i");		
        System.out.println("mul is: "+ m.real+" + "+ m.imaginary +"i");	
			    }
			

	}


