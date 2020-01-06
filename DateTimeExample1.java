package JavaDateTime;
import java.time.LocalDate;
import java.time.Month;
public class DateTimeExample1 {
	public static void main(String args[])
	{
		LocalDate localDate = 	LocalDate.now();
		System.out.println("Today's Date is : "+localDate);
		LocalDate localDate2 = LocalDate.of(2020, Month.JANUARY, 02);
		System.out.println(localDate2);
		LocalDate localDate3 = LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println(localDate3);
		
		System.out.println("Year : "+localDate.getYear());
		System.out.println("Month : "+localDate.getMonth());
		System.out.println("Day of month : "+localDate.getDayOfMonth());
		System.out.println("Day of week : "+localDate.getDayOfWeek());
		System.out.println("Day of year : "+localDate.getDayOfYear());
		
		//Local Date plus methods
		System.out.println("Addition of Days : "+localDate.plusDays(5));
		System.out.println("Addition of months : "+localDate.plusMonths(15));
		System.out.println("Addition of weeks : "+localDate.plusWeeks(45));
		System.out.println("Addition of years : "+localDate.plusYears(5));
		
		//Local Date's minus method
		System.out.println("Subtraction of days : "+localDate.minusDays(5));
		System.out.println("Subtraction of months : "+localDate.minusMonths(45));
		System.out.println("Subtraction of weeks : "+localDate.minusWeeks(45));
		System.out.println("Subtraction of year : "+localDate.minusYears(5));
		
		//if equals() example
		if(localDate.isEqual(localDate2))
		{
			System.out.println("localDate and localDate2 are equal");
		}
		else
		{
			System.out.println("localDate and localDate2 are not equal");
			
		}
		//if After() example
		if(localDate2.isAfter(localDate3))
		{
			System.out.println("localDate2 comes after localDate3");
		}
		//if isBefore example
		
		if(localDate3.isBefore(localDate))
		{
			System.out.println("localDate3 comes before localDate");
		}
	}

}
