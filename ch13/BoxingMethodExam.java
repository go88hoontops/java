package com.jh.ch13;

public class BoxingMethodExam {

	public static void main (String[] args) {
		
		Box<Integer> box1 = Util.<Integer> boxing(100);
		int intValue = box1.get();
		System.out.println(box1);
		
		
		Box<String> box2 = Util.boxing("홍길이");
		String strValue = box2.get();
		System.out.println(box2);
	}
	
}
