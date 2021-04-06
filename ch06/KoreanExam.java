package com.jh.ch06;

public class KoreanExam {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "010125-1234567");
		
		
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("너자바", "910125-1234567");
		
		
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
	}

}
