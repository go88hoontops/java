package com.jh.ch05;

public class StringEqualsExam {

	public static void main(String[] args) {

		String strVal1 = "이정훈";
		String strVal2 = "이정훈";
		
		
		if (strVal1 == strVal2) {
			System.out.println("strVal1 과 strVal2 는 참조가 같음");
		}else {
			System.out.println("strVal1 과 strVal2 는 참조가 다름");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1 과 strVal2 는 문자열이 같음");
		}
		
		String strVal3 = new String("이정훈");
		String strVal4 = new String("이정훈");
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3 과 strVal4 는 참조가 같음");
		}else {
			System.out.println("strVal3 과 strVal4 는 참조가 다름");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3 과 strVal4 는 문자열이 같음");
		}
		
	}

} //참조는 문자가 위치한 장소로 생각함
