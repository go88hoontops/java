package com.jh.test;

import java.util.Scanner;

public class TestLogin01 {

	public static void main(String[] args) {
		
		String[] user = {"urId","Email"};
	
		user[0] = "hoon";
		user[1] = "hoon@go.com";
				
		System.out.println("당신의 아이디를 입력하세요");
		Scanner scanId = new Scanner(System.in);
		String inputString;
		inputString = scanId.nextLine();
				
		if(inputString.equals(user[0])) {
			
			System.out.println("email or 비밀번호를 입력하시오");
		
			
			//	System.out.println("당신의 EMAIL을 입력해주세요 ");
				
					Scanner scanEmail = new Scanner(System.in);
					inputString = scanEmail.nextLine();
		
			if(inputString.equals(user[1])) {
				
				System.out.println(" Login 성공~");
		
			}else {
			
				System.out.println("다시확인해주세요 ");
		
			}
			
			
			
		}else{
			System.out.println("다시확인해주세요");
			
			
		}
	
	}
}