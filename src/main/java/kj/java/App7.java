package kj.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class App7 {
	public static void main(String[] args) {
//		sample01();
		sample02();
	}
	private static void sample02() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
		System.out.println(format(calendar.getTime()));
		calendar.add(Calendar.DAY_OF_MONTH, 90);
		System.out.println(format(calendar.getTime()));
		
		DateTime datetime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
		System.out.println(datetime.plusDays(90).toString("yyyy-MM-dd HH:mm:ss.SSS"));
	}
	public static void sample01() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, Calendar.JANUARY, 2, 10, 20, 30);
//		calendar.setTimeInMillis(100);
		System.out.println(format(calendar.getTime()));
		
		DateTime datetime = new DateTime(2000, 1, 2, 10, 20, 30, 100);
		System.out.println(format(datetime.toDate()));
	}
	
	public static String format(Date date){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date);
	}
}
