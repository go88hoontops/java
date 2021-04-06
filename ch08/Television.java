package com.jh.ch08;
//15 번부터 인터페이스 리모트컨트롤의 상수를 이용함
public class Television implements RemoteControl{
//상수필드
	private int volume ;
	
	//turnOn 의 실체메소드
	public void turnOn(){
		System.out.println("tv를 킵니다");
	}
	//turnOff 의 실체메소드
	public void turnOff(){
		System.out.println("tv를 끕니다");
	}
	//setVolume 의 실체메소드
	public void serVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		}else if(volume < RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		}else {
			this.volume = volume;
		}
		System.out.println("현재볼륨 :" +volume);
		
	}
	@Override
	public void setVolum(int volum) {
		// TODO Auto-generated method stub
		
	}

}
