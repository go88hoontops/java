package com.jh.ch10;

public class TryCatchFinallyExam {

	public static void main(String[] args) {

		try {
			Class clazz= Class.forName("JAVA.lang.String2");
			
		}catch(ClassNotFoundException e){
			
			System.out.println("클라스가 존재하지않습니다.");
		}
		
		
	}

}
