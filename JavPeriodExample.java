package JavaDateTime;
import java.time.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class JavPeriodExample {
	public static void main(String args[])
	{
		Period period1 = Period.ofDays(24);
		Temporal temp = period1.addTo(LocalDate.now());
		System.out.println(temp);//add 24 days 
		
		Period period2 = Period.of(2020, 01, 06);
		System.out.println(period2.toString());//print given i/p that must <=current day
		
		Period period3 = Period.ofMonths(4);
		Period period4 = period3.minus(Period.ofMonths(2));
		System.out.println(period4);
		
		Period period5 = period3.plus(Period.ofMonths(2));
		System.out.println(period5);
		
		Duration d = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(d.get(ChronoUnit.SECONDS));
		
		Duration d1 = Duration.between(LocalTime.MAX, LocalTime.NOON);
		System.out.println(d1.isNegative());
		
		Duration d2 = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(d2.isNegative());
		System.out.println(d.getSeconds());
		
		Duration d3 = d.minus(d);
		System.out.println(d3);
		Duration d4 = d.plus(d);
		System.out.println(d4);
	}

}
