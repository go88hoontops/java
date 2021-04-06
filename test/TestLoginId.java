package com.jh.test;

import java.util.Scanner;

public class TestLoginId {


	public static void Login() {
	
	}
		
	
	public static void main(String[] args) {
		
	String[] user = {"hoons","hoonhoonhoon@ooofo.com","0020"};
				
	String Id = user[0];
	String Em = user[1];
	String Ps = user[2];
	
	
	
		System.out.println("당신의 아이디를 입력하세요");
		Scanner scanId = new Scanner(System.in);
		String inputString;
		inputString = scanId.nextLine();
	
		if(inputString.equals(Id)) {
			
			
			System.out.println("비밀번호를 입력하세요");
		
			Scanner scanPs = new Scanner(System.in);
			String inputString1;
			inputString1  = scanPs.nextLine();
				
			if(inputString1.equals(Ps)) {
			
				System.out.println("성공");
			
			}else {
				System.out.println("다시확인해주세요, 비밀번호를 찾으려면 이메일을 남겨주세요");

				Scanner scanEm = new Scanner(System.in);
				String inputString2;
				inputString2  = scanEm.nextLine();
				
				if(inputString2.equals(Em)) {
					System.out.println("발송되엇습니다 이메일에 가서 확인해보셈");
				}else {
					System.out.println("다시확인해");
				}
			}
			
			
		}else {
			System.out.println("다시확인해주세요");
			
		}
		 
		
		}
	}
