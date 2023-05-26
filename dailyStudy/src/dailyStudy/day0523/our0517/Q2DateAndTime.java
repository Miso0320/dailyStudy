package dailyStudy.day0523.our0517;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Q2DateAndTime {
	public static void main(String[] args) {
		System.out.println("<Date 클래스 사용>");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("현재 날짜와 시간 : " + sdf.format(date));

		System.out.println("<Calendar 클래스 사용>");
		Calendar cl = Calendar.getInstance();
		// 오전, 오후 문자 출력을 위한 변수 및 조건문
		int amPm = cl.get(Calendar.AM_PM);
		String amPnStr = null;
		if (amPm == Calendar.AM) {
			amPnStr = "오전";
		} else {
			amPnStr = "오후";
		}
		System.out.println("현재 날짜 : " + cl.get(Calendar.YEAR) + "년 " + (cl.get(Calendar.MONTH) + 1) + "월 "
				+ cl.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println("현재 시간 : " + amPnStr + " " + cl.get(Calendar.HOUR) + "시 " + cl.get(Calendar.MINUTE) + "분 "
				+ cl.get(Calendar.SECOND) + "초");

		System.out.println("<LocalDateTime 클래스 사용>");
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println("현재 날짜와 시간 : " + ldt.format(dtf));
	}
}