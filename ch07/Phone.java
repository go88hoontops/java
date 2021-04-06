package com.jh.ch07;
//추상클래스 abstract
public abstract class Phone {

	public String owner;	//필드
	
	//생성자 
	public Phone(String owner) {
		this.owner=owner;
	}

	//메소드
	public void turnOn() {
		System.out.println("폰을켭니다.");
	}
	public void turnOff() {
		
		System.out.println("폰을 끕니다.");
	}

}


