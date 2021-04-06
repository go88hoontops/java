package com.jh.ch13;

public class Box <T>{

//	private Object object;
//	public void set(Object object) { this.object =object; }
//	public Object get() {return object; }
// 아래 코드가 위의코드와 같음.

	private T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
