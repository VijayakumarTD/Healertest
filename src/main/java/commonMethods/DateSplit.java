package commonMethods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DateSplit extends Keywords{
	
	public static WebDriver driver;
	public static void main(String a[])
	{
		/*
		
		Date date; // your date
	    Calendar cal = Calendar.getInstance();
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH);
	    int monthinc=month+1;
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    System.out.println(year+"-----"+monthinc+"----"+day);
	    Date date1=java.util.Calendar.getInstance().getTime();
	    System.out.println(date1);
	   
	   Calendar cal = Calendar.getInstance();
		Calendar text = Calendar.getInstance();
		cal.add(Calendar.MINUTE,100);
		text.add(Calendar.MINUTE,130);
		*/
		
		String texttt = "7-35-PM";
		
		String[] a1 = texttt.split("-");
		
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		
		String StartTime  = Utils.getDataFromTestData("Personal_Yoga","StartTime");
		System.out.println(StartTime);
		
		String StartTime1  = Utils.getDataFromTestData("Personal_Yoga","EndTime");
		System.out.println(StartTime1);
	 
		/*
	    
		SimpleDateFormat df = new SimpleDateFormat("hh-mm-aa");
		System.out.println(df.format(texttt));
		    
		String[] split = df.format(texttt).split("-");
	    	
	//    int str = Integer.parseInt(split[0]);
	 //   int str1 = Integer.parseInt(split[1]);
	    String str2 = split[2];
		   
	 
	 */
	   
	    
	}
	
	
}
