package JavaDateTime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class JavaOffsetExample {
	public static void main(String args[])
	{
		OffsetTime offset = OffsetTime.now();
		int h=offset.get(ChronoField.HOUR_OF_DAY);
		
		System.out.println(h);//present hour 
		
		int m =offset.get(ChronoField.MINUTE_OF_DAY);
		
		System.out.println(m);//present minute from the day start
		
		int s =offset.get(ChronoField.SECOND_OF_DAY);
		
		System.out.println(s);//present second from the day start
		
		int h1=offset.getHour();//op localTime hour
		
		System.out.println(h1+" hour");
		
		int m1= offset.getMinute();//op localTime minute
		
		System.out.println(m1+"minute");
		
		int s1=offset.getSecond();
		
		System.out.println(s1+"second");////op localTime second
		
		
	}

}
