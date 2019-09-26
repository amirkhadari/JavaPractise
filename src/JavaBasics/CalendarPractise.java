package JavaBasics;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print current date using calendar class with getinstance() Method
		Calendar c = Calendar.getInstance();
		System.out.println("Current date is: "+c.getTime());
		System.out.println("Current calendar year: "+c.get(Calendar.YEAR));
		System.out.println("Current calendar month: "+c.get(Calendar.DATE));
		System.out.println("Current calendar day: "+c.get(Calendar.DAY_OF_MONTH));
//		System.out.println("Current day: "+c.get(Calendar.));
		
		Date now = new Date();
		//This statement will print the day in abbrevation form
		SimpleDateFormat dateformat = new SimpleDateFormat("E");
		System.out.println(dateformat.format(now));
		
		//This statement will print the day in full form
		dateformat = new SimpleDateFormat("EEEE");
		System.out.println(dateformat.format(now));
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		int year = scan.nextInt();
		scan.close();
		LocalDate dt = LocalDate.of(year, month, day);
		System.out.println(dt.getDayOfWeek());
		
	}

}
