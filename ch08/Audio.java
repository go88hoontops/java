package com.jh.ch08;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	private boolean mute;

	public void turnOn() {
		System.out.println("Audio on..");
	}

	public void turnOff() {
		System.out.println("Audio off..");
		
	}

	public void setVolum(int volume) {

		if(volume>RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		}else if(volume < RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 :" +volume);
		
	
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("audio 를 무음처리합니다");
		}else {
			System.out.println("audio 의 무음을 해제합니다");
			
		}
	}
}
