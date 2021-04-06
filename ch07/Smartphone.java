package com.jh.ch07;

public class Smartphone extends Phone{
	//생성자 오버로드
	public Smartphone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷검색을 시작합니다.");
	}
}
