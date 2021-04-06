package com.jh.ch03;

public class signOperatorExam {

	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1="+ result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		
		
		//short result3 = -s; ( short 값은 int 값으로 저장되기때문에 에러남)
		
		int result3 = -s;
		
		System.out.println("result3 ="+ result3);
		
	}
	
}
