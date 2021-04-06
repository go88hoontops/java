package com.jh.ch04;

public class SwitchNoBreakCaseExam {

	public static void main(String[] args) {
 
		
			int time = (int)(Math.random()*4) +8;
			
			System.out.println("현재시간: " +time +"시");
	
	
	
	switch(time) {
	case 8:
		System.out.println(" 출근타임");
	
	case 9 :
		System.out.println(" 회의타임");
	
	case 10:
		System.out.println(" 업무타임");
	
	default:
		System.out.println(" 외근타임");
	
	}
	
	}
	
}
