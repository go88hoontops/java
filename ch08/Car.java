package com.jh.ch08;
//한국타이어, 금호타이어 ,Tire 인터페이스를 이용한다.
//다형성을 느껴보자.
public class Car {
//인터페이스 타입 필드선언, 초기구현 객체를 대입
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	
	void run() {
			//인터페이스에서 설명된 roll을 호출
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}


}
