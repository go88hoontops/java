package com.jh.ch07;

public abstract class Animal { //추상클래스

	public String kind;
	
	public void breathe(){
		System.out.println("숨을쉰다..후.."); 
		
	}
	
	public abstract void sound();// 추상메소드
}
