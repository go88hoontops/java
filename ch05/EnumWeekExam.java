
package com.jh.ch05;

import java.util.Calendar;

public class EnumWeekExam {

	public static void main(String[] args) {

		
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); //임포트한 자바 라이브러리 가지고오는거임
		
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		
		case 1:
			today = Week.SUNDAY; break;
			
		case 2:
			today = Week.MONDAY; break;
			
		case 3:
			today = Week.TUESDAY; break;
			
		case 4:
			today = Week.WEDNESDAY; break;
			
		case 5:
			today = Week.THURSDAY; break;
			
		case 6:
			today = Week.FRIDAY; break;
			
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘은 " + today);
		
		if (today == Week.SUNDAY) {
			
			System.out.println("일요일은 짜파게리~");
					
		}else {
			System.out.println("평일은 공부를 합니다 ㅆ ㅏㅃ ㅏ~");
		}
	}

}
