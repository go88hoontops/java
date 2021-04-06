package com.jh.ch07;

public class ChildExample {

	public static void main(String[] args) {

		Parent1 parent1 = new Child1(); 
		parent1.field1="data1";
		
		parent1.method1();
		parent1.method2();
		/*
		 *parent.field2="data2" 불가
		 	parent.method3(); 불가
		 */
		Child1 child =(Child1) parent1;
		child.field2 ="yyy";
		child.method3();
		
	}

}
