package com.jh.ch06;

public class Runcar {

	int speed; 
	
	void run() {
		System.out.println(speed +"km/h 의 속도로 달립니다.");
		
	}
	public static void main(String[] args) {

		
		Runcar runcar = new Runcar();
		
		runcar.speed = 60;
		runcar.run();
		
		
	}

}
