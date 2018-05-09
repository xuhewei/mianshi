package note3_biancheng;

import java.util.Calendar;
import java.util.Date;

public class TestDate01 {
	
	public static void main(String[] args) {
		
		String dats = TestDate01.getWeekOfDate(new Date());
		System.out.println(dats);
	}
	
	public static String getWeekOfDate(Date date) {  
        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };  
        Calendar cal = Calendar.getInstance();  
        cal.add(Calendar.DATE, 3);
        //cal.setTime(date);  
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;  
        if (w < 0)  
            w = 0;  
        return weekDays[w];  
    }  
}
