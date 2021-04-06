package com.jh.ch13;
//제너릭 처음 예제
//box, apple 클래스 참고
//Casting 과정이 번거로워서 이제 바뀔예정임

public class BoxExam {

	public static void main(String[] args) {
	
		Box<String> box1 = new Box<String>();
		box1.set("헬로룰");
		System.out.println( box1);
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(88);
		System.out.println( box2);
		System.out.println( box1);
		Integer value = box2.get();
		
		
		
		
		
		
		
		
		Box box = new Box();
		box.set("니가가라");
		String name = (String) box.get();
		
		box.set(new Apple());
		System.out.println(box);
		Apple apple = (Apple) box.get();
		
	}
	

}
