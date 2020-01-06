package JavaDateTime;
import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeExample3 {
	public static void main(String args[])
	{
		//ISO Date
		LocalDate ld1=LocalDate.now();
		DateTimeFormatter df1= DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(ld1.format(df1));
		
		//yyyy/MM/dd pattern
		DateTimeFormatter df2=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(ld1.format(df2));
		
		//MMMM dd,yyyy pattern
		DateTimeFormatter df3=DateTimeFormatter.ofPattern("MMMM dd,yyyy");
		System.out.println(ld1.format(df3));
		
		//dd-MMM-yyyy pattern
		DateTimeFormatter df4=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(ld1.format(df4));
		
		//dd-LL-yyyy pattern
		DateTimeFormatter df5=DateTimeFormatter.ofPattern("dd-LL-yyyy");
		System.out.println(ld1.format(df5));
	}

}
