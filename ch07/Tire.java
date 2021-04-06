package com.jh.ch07;

public class Tire {

	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	
	//생성자
	public Tire(String location , int maxRotation) {
		
		this.location =location; //초기화
		this.maxRotation=maxRotation; //초기화
		
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " +(maxRotation-accumulatedRotation)+ "회");
			return true;							//정상적일때 
		}else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;						//비정상적일떄
		}
		
	}
				// 자동차 클래스의 도구인 타이어클래스
}
