package com.jh.ch10;

public class TryCatchFinallyRunTimeExceptionExam {

	public static void main(String[] args) {

		String val1 = null;
		String val2 = null;
	
			try {
				val1 = args[0];
				val2 = args[1];
			}catch(RuntimeException e) {
				System.out.println("실행 매개값의 수가 부족합니다.");
				System.out.println(":실행방법:");
				System.out.println("Java TryCatchFinallyRunTimeExceptionExam val1 val2");
					return;
			}
	
			try {
				int value1 = Integer.parseInt(val1);
				int value2 = Integer.parseInt(val2);
				int result = value1 + value2;
				System.out.println(result + "=" + val1+"+"+val2);
			}catch(NumberFormatException e ) {
				System.out.println("숫자로 변환되지않습니다.");
			}finally {
				
				System.out.println("복습하세요.");
			}
	
				
	
	}

}
