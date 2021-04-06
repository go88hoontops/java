package com.jh.ch10;

public class ThrowsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			findClass();
			
		}catch(ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
		}
		
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("Java.lang.String2");
	}
}
