package com.jh.ch06;

public class FirstClassPractice {

	public class Car {
		
		String company = "현대차";
		String model = "제네시스";
		String color = "검정";
		
		int maxSpeed = 350;
	}
	
	
	public void speedUp (int speed) {
		
		int speedCurrent = 10;
		int maxSpeed = 50;
		
		
		
		if(speedCurrent > maxSpeed) {
			
			speedCurrent += speed;
			
			
		
		}else {
			//pass
		}
		System.out.println(speedCurrent);
		System.out.println(speed);
	}
	
	public static void main(String[] args) {
		
		FirstClassPractice myCar = new FirstClassPractice();
		
//		 접근지정자 class 클래스명 {
//		             () 가 없고 주는값도 받는값도 없는건가?
//		 fields : 속성  method :동작
//		 }
//		
		
		myCar.speedUp(60);
		
		
		
	}

}
