package com.jh.ch04;


import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {

		System.out.println("메세지를 입력하시오");
		System.out.println("프로그램을 종료하시려면 'Q' 를 누르세요");
		
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do{
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("Q"));
		
		scanner.close();
		
		System.out.println();
		System.out.println("프로그램종료");
		
	}

}
