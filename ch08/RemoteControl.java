package com.jh.ch08;

public interface RemoteControl {
//상수
	public int MAX_VOLUM = 10;
	public int MIN_VOLUM = 0;
//추상메소드 abstract
//메소드 선언부만 작성한다.
//인터페이스는 객체를 부를때 중간에서 처리하는거?
	public void turnOn();
	public void turnOff();
	public void setVolum(int volum);

	
//디폴트메소드
//디폴트메소드는 선언과동시에 실행내용작성해준다.
	// 가져다쓸때 override g할수있다
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리중");
		}else {
			System.out.println("무음해제중");
		}
	}
//정적메소드
	
	static void changeBattery(){
		System.out.println("전지를 교환함.");
	}
	
	
}
