package com.jh.ch13;

public class Pair < K, V>{

	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void setKey(K key) {
		
		this.key=key;
		System.out.println(key);
		}
	
	public void setValue (V value) {
		this.value=value;
		System.out.println(value);
		}
	public K getKey() {
		System.out.println(key);
		return key;
		}
	
	
	public V getValue() {
		System.out.println(value);
		return value;
		}
	
}
