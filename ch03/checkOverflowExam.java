package com.jh.ch03;

public class checkOverflowExam {
	
	public static void main (String[] args) {
		
		try {
			
				int result = safeAdd(2000000000, 2000000000);
				
				System.out.println(result);
				
		} catch(ArithmeticException e) {
			
			System.out.println("오버플로우가 발생해서 정확한계산 불가");      //캐치로 예외처리
								
				}
	}
	
	
	public static int safeAdd(int left, int right) {
		
		if((right > 0)) {
			if(left >(Integer.MAX_VALUE - right)) {                             //예외발생 코드
				
				throw new ArithmeticException(" 오 버 플 로 우 발 생");
				
			}
		} else {
				if(left < (Integer.MIN_VALUE - right)) {                             //예외발생 코드
				
				throw new ArithmeticException(" 오 버 플 로 우 발 생");
				
			
				}
		}
		
		return left  + right ;
	}
	
	
	
}
