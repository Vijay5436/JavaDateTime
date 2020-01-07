package JavaDateTime;
import java.time.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JavaYearExample 
{
	public static void main(String args[])
	{
		Year y1 = Year.now();
		System.out.println(y1);//local year
		
		Year y2 = Year.of(2020);
		LocalDate l= y2.atDay(100);
		System.out.println(l);//plus 100 days
		
		System.out.println(y2.length());//total number of days
		System.out.println(y2.isLeap());//leap year or not
		
		YearMonth ym = YearMonth.now();
		System.out.println(ym);//print year and month
		
		String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
		System.out.println(s);//print given pattern
		
		long l1 = ym.get(ChronoField.YEAR);
		System.out.println(l1);//given year
		
		long l2  = ym.getLong(ChronoField.MONTH_OF_YEAR);
		System.out.println(l2);//given month
		
		YearMonth ym2 = ym.plus(Period.ofYears(2));
		System.out.println(ym2);//add 2 years 
		
		YearMonth ym3 = ym.minus(Period.ofYears(2));
		System.out.println(ym3);//minus 2 years
		
	}

}
