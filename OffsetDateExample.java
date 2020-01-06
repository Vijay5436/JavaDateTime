package JavaDateTime;
import java.time.OffsetDateTime;
public class OffsetDateExample {
	public static void main(String args[])
	{
		OffsetDateTime offsetDT= OffsetDateTime.now();
		
		System.out.println(offsetDT.getDayOfMonth());//current date
		
		System.out.println(offsetDT.getDayOfYear());//current date
		
		System.out.println(offsetDT.getDayOfWeek());//current week 
		
		System.out.println(offsetDT.toLocalDate());//
		
		OffsetDateTime value1= offsetDT.minusDays(240);//minus 240 from current date
		
		System.out.println(value1);
		
		OffsetDateTime value2= offsetDT.plusDays(240);//plus 240 to current date
		
		System.out.println(value2);
		System.out.println(value2.getDayOfWeek());
		
	}

}
