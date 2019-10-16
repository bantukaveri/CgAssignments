package Assignments;

public class SixAccount {
	
	static Long money;

	public static void main(String[] args) {
		deposit();
		withdraw();
		print();
		

	}

	public static void deposit() {
		System.out.println("Amount is deposited");
		}
		
    public static void withdraw() {
		System.out.println("Amount is withdraw");
	}
      
    public static void print() {
 		System.out.println("Amount in your account is");
 	}
	
}
