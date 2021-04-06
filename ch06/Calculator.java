package com.jh.ch06;

public class Calculator {
	
	void powerOn () {
			System.out.println("���������ϴ�");
			}
	
	int plus(int a ,int b) {
	int result  = a + b;
	return result;
	}
	
	double divide (int x, int y) {
	double result = (double)x / (double)y;
	return result;
	}
	
	
	void off() {
		 System.out.println("���������ϴ�.");
	}
	
	
	public static void main(String[] args) {

	
		Calculator calculator = new Calculator(); //��ü���� 
		
		calculator.powerOn();
		
		
		int result1 = calculator.plus(5, 6);
		System.out.println(result1);
		
		byte x =10;
		byte y =4;
		double result2 = calculator.divide(x,y);
		System.out.println(result2);
	
		calculator.off();
	
	}
	
	

}
