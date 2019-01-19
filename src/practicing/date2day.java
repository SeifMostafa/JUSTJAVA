package practicing;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class date2day {
	public static String findDay(int month, int day, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        DateFormatSymbols dfs = new DateFormatSymbols();
	    return dfs.getWeekdays()[weekday].toUpperCase();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findDay(8,05,2015));
	}

}
