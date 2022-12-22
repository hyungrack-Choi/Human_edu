package human18;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		System.out.println(now.toString());
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY: //Calendar.monday 는 2이란 수치를 static final로 calendar 클래스에서 정의
			strWeek = "월";
			break;
		case Calendar.TUESDAY://Calendar.monday 는 3이란 수치를 static final로 calendar 클래스에서 정의
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY://Calendar.monday 는 4이란 수치를 static final로 calendar 클래스에서 정의
			strWeek = "수";
			break;
		case Calendar.THURSDAY://Calendar.monday 는 5이란 수치를 static final로 calendar 클래스에서 정의
			strWeek = "목";
			break;
		case Calendar.FRIDAY://Calendar.monday 는 6이란 수치를 static final로 calendar 클래스에서 정의
			strWeek = "금";
			break;
		case Calendar.SATURDAY://Calendar.monday 는 7이란 수치를 static final로 calendar 클래스에서 정의
			strWeek = "토";
			break;
		default:
			strWeek = "일";//Calendar.monday 는 0이란 수치를 static final로 calendar 클래스에서 정의
			break;
		}
		
		int apPM = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(apPM == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int minte = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년 ");
		System.out.println(month + "월 ");
		System.out.println(day + "일 ");
		System.out.println(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.println(hour + "시 ");
		System.out.println(minte + "분 ");
		System.out.println(second + "초 ");
		System.out.printf("%d년 %d월 %d일 %s요일 %s %d:%d:%d", year,month,day,strWeek,strAmPm,hour,minte,second);
	}
}