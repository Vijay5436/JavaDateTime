package JavaDateTime;
import java.time.Clock;
import java.time.Duration;
public class JavaClockExample {
	public static void main(String args[])
	{
		Clock c1 = Clock.systemDefaultZone();
		System.out.println(c1.getZone());//zone asia
		
		Clock c2=Clock.systemUTC();//universal time codinator
		System.out.println(c2.instant());
		
		Duration d=Duration.ofHours(5);//difference from universal time is 5H
		Clock clock= Clock.offset(c2, d);
		System.out.println(clock.instant());
	}

}
