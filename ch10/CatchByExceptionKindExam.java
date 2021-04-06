package com.jh.ch10;

public class CatchByExceptionKindExam {
//예외처리 순서확인해야함..
	//위에나오는 Exception 이라면 예외처리 제일아래로 123 321 순으로/
	public static void main(String[] args) {

		
			try {
				String data1 = args[0];
				String data2 = args[1];
				
				int value1 = Integer.parseInt(data1);
				int value2 = Integer.parseInt(data2);
				int result = value1+value2;
				
				
			}catch(ArrayIndexOutOfBoundsException e ) {
				System.out.println("실행 매개값의 수가 부족합니다.");
				System.out.println("[실행방법]");
				System.out.println("Java ArrayIndexOutofBoundException num1 num2.");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할수없습니다.");
				System.out.println("[실행방법]");
				System.out.println("Java InstanceOf and NumberFormat Check...");
				
			} finally {
				System.out.println("공부하세요..");
			}
		
	}

}
