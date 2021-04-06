package com.jh.ch10;

public class TryWithResourceExam {

	public static void main(String[] args) {

		
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception(); //강제적으로 예외를 발생시킴
		}catch(Exception e) {
			System.out.println("예외처리 코드가 실행됩니다.");
		}
		
	}

}
