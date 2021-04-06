package com.jh.ch07;

public class DmbCellPhone extends CellPhone {

	int channel;
	
	//부모 Cellphone 에서 모델 컬러 필드를 가져옴
	DmbCellPhone(String model, String color, int channel){
		
		this.model = model;
		this.color = color;
		this.channel = channel;
		
		
		
	}
	
	//메소드
	
	void turnOnDmb(){
		System.out.println("DMB를 켭니다");
	}
	
	void changChannel() {
		System.out.println("채널"+channel+"번으로 채널변경");
	}

	void turnOff() {
		System.out.println("방송을 끕니다");
	}
}