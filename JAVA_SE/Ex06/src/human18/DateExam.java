package human18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());

		SimpleDateFormat sdate = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
		String str1 =  sdate.format(now);
		System.out.println(str1);

		SimpleDateFormat sdate2 = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		String str2 =  sdate2.format(now);
		System.out.println(str2);
		
	}

}
