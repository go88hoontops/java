package com.jh.test;

public class NewFindId2 {

	public static void main(String[] args) {

		String[] User= { "hoon","oooo22","hoon@nn.com"};
	
		//짧게 한방에간다.
		
//		String ad = "IDqkqk";
//		String ps = "PSkaka";				배열을 사용안하는거같아서 다시
//		String Em = "hoon@nn.com";
		
		String Id = User[0];
		String Ps = User[1];
		String Em = User[2];
		
		
		
		if(User[0].equals(Id) && User[1].equals(Ps)) {
			System.out.println("성공");
	
		
		}else {
			System.out.println("다시시도하세요 - 아이디를 찾으려면 Email을 입력하세요");
		
			
			if(User[2].equals(Em)) {
			System.out.println("발송됨 확인");
		
			
			}else {
				System.out.println("다시확인하세요");
			}
		
		}
		
		
		
	}

}
