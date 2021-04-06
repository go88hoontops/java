package com.jh.ch13;
public class Box_T<T> {

	private T t;
	
	public T get() {
		System.out.println(t);
		return t;
	}
	
	public void set(T t) {
		System.out.println(t);
	this.t = t;
		
	}
	
	
}
