package Assignments;

public class SeventhResults {
	
	
	static int subject1=50;
	static   int subject2=60;
	static  int subject3=60;
	 
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        if(subject1>=60 &&subject2>=60 && subject3>=60 )
        {
        	System.out.println("passed");
        }
        else if(subject1>=60&&subject2>=60 ||subject2>=60&&subject3>=60 || subject3>=60&&subject1>=60) {
        	System.out.println("promoted");
        }
        else {
        System.out.println("failed");
        }
        	
        	
        }
           
}


