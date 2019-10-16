package Assignments;

import java.text.SimpleDateFormat;

public class Date {
	
	String  month;
	int year;
	int day;
	
	static String strDate;
	String swapDate;
	public Date(String month, int year, int day) {
		super();
		this.month = month;
		this.year = year;
		this.day = day;
	}

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public static void printDate() {
		Date d1= new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yy");
 strDate = formatter.format(d1);
 System.out.println(strDate);
	}
	
	public static void swapDate(String string) {
		
		String[]date= strDate.split("/");
		String swap=strDate.replace(date[0], strDate);
		System.out.println(swap);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          printDate();
          swapDate("29");
	}

}
