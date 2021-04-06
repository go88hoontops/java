package com.jh.ch04;

public class BreakExam1 {

	public static void main(String[] args) {

		
	Outter: for(char upper ='A'; upper <='Z'; upper++) {
		for(char lower ='a'; lower <= 'z'; lower++ ) {
			System.out.println(upper + "-" + lower);
		if(lower=='s') {
			break Outter;
		}
		
		}
	}
		System.out.println("프로그램 종료");
		
	}

}
