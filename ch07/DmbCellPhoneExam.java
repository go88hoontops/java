package com.jh.ch07;

public class DmbCellPhoneExam {

	public static void main(String[] args) {

		
		DmbCellPhone dmbCellPhone =new DmbCellPhone("아이폰","그레이",99) ;
		//from cellphone
		System.out.println(" 모델 : "+dmbCellPhone.model);
		System.out.println(" 컬러 : "+dmbCellPhone.color);
		//from dmbcellphon
		System.out.println(" 채널 : "+dmbCellPhone.channel);
		
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보양");
		dmbCellPhone.getVoice("보곳깊다");
		dmbCellPhone.hangUp();
		
		
		//DmbCell의 메소드호출
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changChannel();
		dmbCellPhone.turnOff();
		
	}

}
