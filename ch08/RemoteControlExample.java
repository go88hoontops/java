package com.jh.ch08;

public class RemoteControlExample{

	public static void main(String[] args) {
		
		RemoteControl rc = null; //인터페이스 변수선언 
		
		rc = new Television();//Television 객체르 인터페이스 변수 rc에 대입
		rc.turnOn();
		rc.turnOff(); //인터페이스의 클래스호출?
		
		rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.setVolum(8);
	
	}
}
