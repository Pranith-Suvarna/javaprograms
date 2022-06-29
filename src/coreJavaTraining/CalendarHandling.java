package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarHandling {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.AM_PM));
        
    //    printNum(1);
        
       
	}
	
	 public static void printNum(int num) {
     	if(num<=100)
     	{
     		System.out.println(num);
     		num++;
     		printNum(num);
     	}
     }
	 
}
