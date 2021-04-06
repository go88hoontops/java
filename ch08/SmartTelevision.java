package com.jh.ch08;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	//필드 상수!
	
	public void turnOn() {
		System.out.println("smart - tv 를 켭니다");
	}
	public void turnOff() {
		System.out.println("smart - tv 를 off");
	}
	public void setVolume(int volume) {
	if(volume>RemoteControl.MAX_VOLUM) {
		this.volume = RemoteControl.MAX_VOLUM;
	}else if(volume < RemoteControl.MIN_VOLUM) {
		this.volume = RemoteControl.MIN_VOLUM;
	}else {
		this.volume = volume;
	}
	System.out.println("현재 볼륨 :" +volume);

	}
	public void search(String url) {
		System.out.println(url + " 을 검색합니다");

}
//	@Override
//	public void setVolum(int volum) {
//		// TODO Auto-generated method stub
//		하단은 짤라야지..
	@Override
	public void setVolum(int volum) {
		// TODO Auto-generated method stub
		
	}
	

}
