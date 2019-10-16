package Assignments;



import java.time.LocalDate;
public class DateDemo {
	
    private static LocalDate date;
	private static LocalDate yesterday;
	int day;
	int month;
	int year;
	
public DateDemo(int day,int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

   public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


   public static void printDate() {
	    LocalDate date = LocalDate.now();  
		LocalDate yesterday = date.minusDays(1);  
		System.out.println("Today date is : "+date);  
		System.out.println("Yesterday date is : "+yesterday);  
	}
   
 public static void swapDate(LocalDate date, LocalDate yesterday) {
	 LocalDate r= date;
	 date= yesterday;
	  yesterday=r;
	 
	 System.out.println(date);
	 System.out.println( yesterday);
	 
 }
   
 public static LocalDate getDate() {
	return date;
}

public static void setDate(LocalDate date) {
	DateDemo.date = date;
}

public static LocalDate getYesterday() {
	return yesterday;
}

public static void setYesterday(LocalDate yesterday) {
	DateDemo.yesterday = yesterday;
}

public static void main(String args[]) {
	     printDate();
	     swapDate(date, yesterday);
 }  
   
   public DateDemo() {
	super();
	
}
}

