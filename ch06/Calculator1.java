package com.jh.ch06;
//정적멤버 사용
//하단 스테틱들은 객체변수를 참고할수있음
//정적멤버와 인스턴스 의 차이는 객체마다 가지고있어야할 DATA 의 성격
public class Calculator1 {

	static double pi = 3.145159;
	
	static int plus(int x , int y) {
		return x + y ;
		}
	
	static int minus (int x, int y) {
		return x - y;
		}
	
	
	
	public static void main(String[] args) {

		
		double resutl1 = 10* 10* pi;
										
		int result2 = Calculator1.plus(10, 20);
		int result3 = Calculator1.minus(10, 5);
		
		
		System.out.println(resutl1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}

}
