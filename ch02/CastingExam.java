package com.jh.ch02;

public class CastingExam {

	public static void main(String[] args) {

			int intValue = 44032;
			char charValue = (char)intValue;
			System.out.println(charValue); //인트형 정수를 charValue로 강제 캐스팅
			
			
			long longValue =500;
			intValue = (int)longValue;
			System.out.println(intValue);
			
			double doubleValue = 3.14;
			intValue = (int)doubleValue;
			System.out.println(intValue);
		
			
			
		
	}

}
