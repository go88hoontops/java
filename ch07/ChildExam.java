package com.jh.ch07;

public class ChildExam {

	public static void main(String[] args) {

		Child child = new Child();
		Parent parent = child;
	
		
		parent.method1();  
		parent.method2();  //< 오버로드 (재정의된 정보나옴)
		
		
	}

}
