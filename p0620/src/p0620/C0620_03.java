package p0620;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class C0620_03 {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy");
		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));
//		System.out.println(date.getTime());
		
		//Calendar 객체
		Calendar cal= Calendar.getInstance();
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		//currentTimeMillis 활용날짜출력
		long today=System.currentTimeMillis();
		System.out.println(today);
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf4.format(today));
	}

}
