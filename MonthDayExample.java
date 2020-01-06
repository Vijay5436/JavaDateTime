package JavaDateTime;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExample 
{
	public static void main(String args[])
	{
		MonthDay month = MonthDay.now();
		LocalDate date=month.atYear(2020);
		
		System.out.println(date);//output local date
		
		boolean a = month.isValidYear(2018);
		
		System.out.println(a);
		
		long b = month.get(ChronoField.MONTH_OF_YEAR);
		
		System.out.println(b);//current month 
		
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);
		
		System.out.println(r1);//range of month 1-12
		
		ValueRange r2= month.range(ChronoField.DAY_OF_MONTH);
		
		System.out.println(r2);//range of day in the month
	}

}
