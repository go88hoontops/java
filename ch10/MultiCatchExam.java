package com.jh.ch10;

public class MultiCatchExam {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1= Integer.parseInt(data1);
			int value2= Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 +"="+result);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e){	
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환이 안되고 있어요");
		}catch(Exception e ){
			System.out.println("알수없는 예외인데욥?");
		}finally {
			System.out.println("다시실행해주세용");
		}
	}
}
