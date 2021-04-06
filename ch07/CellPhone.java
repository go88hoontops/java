package com.jh.ch07;
	
public class CellPhone {

	//필드
		String model;
		String color;
		
//생성자 패스
		
	//메소드
		
		void powerOn() {System.out.println("전원킴");}
		void powerOff() {System.out.println("전원끔");}
		void bell () {System.out.println("벨울림");}
		void sendVoice(String message) {
			System.out.println("자기 :"+ message);
		}
		void getVoice (String message) {
			System.out.println("상대 :"+message);
		}
		
		void hangUp() {System.out.println("전화끊음");}
		
		
		
}
