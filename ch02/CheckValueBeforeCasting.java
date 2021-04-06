package com.jh.ch02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {

		
		int i = -128;
		
		if ((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할수없음");
			System.out.println("다시확인해주세요");
			
		}else {
			byte b = (byte)i;
			System.out.println(b);
			
		}
		
		
	}

}
