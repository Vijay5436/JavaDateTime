package JavaDateTime;

import java.sql.Date;

public class JavaSqlDateExample {
	public static void main(String args[])
	{
		long millis = System.currentTimeMillis();
		java.sql.Date date1 = new java.sql.Date(millis);
		System.out.println(date1);
		String s = "2015-03-26";
		Date d1 = Date.valueOf(s);//converting String to sql date
		
		System.out.println(d1);
		
	}

}
