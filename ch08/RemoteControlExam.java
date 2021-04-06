package com.jh.ch08;

public class RemoteControlExam {

	public static void main(String[] args) {
		// Audio, Tv 컨트롤

		
		RemoteControl rc = null;
		rc = new  Television();	
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(false);
		rc.setVolum(9);
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}

}
