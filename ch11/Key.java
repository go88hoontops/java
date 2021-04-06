package com.jh.ch11;
//hashcode()??
public class Key {

	public int number;
	//필드
	
	//생성자
	
	public Key(int number) {
		this.number =number;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Key) {
			Key compareKey =(Key)obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return number;
	}
	
	
}
