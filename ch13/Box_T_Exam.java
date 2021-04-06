package com.jh.ch13;

public class Box_T_Exam {

	public static void main(String[] args) {

		Box_T<String> box1 =new Box_T<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box_T<Integer> box2 = new Box_T<Integer>();
		box2.set(6);
		int value = box2.get();
	}

}
