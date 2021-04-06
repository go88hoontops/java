package com.jh.ch05;

public class StringEqualsExalm {

	public static void main(String[] args) {

		
			String strVar1 = "신발";
			String strVar2 = "신발";
			
			
			if(strVar1 == strVar2) {
				System.out.println("var1 과 var2 는 참조가 같음");
				
			}else {
				
				System.out.println("var1과 var2는 참조가 다름");
			}
			
			if(strVar1.equals(strVar2)) {
				System.out.println("var1 과 var2 는 문자열이 같음");
			}
			
			String strVar3 = new String("이정훈");
			String strVar4 = new String("이정훈");
			
			if (strVar3 == strVar4) {
				
				System.out.println("var3 과 var4는 참조가 같음");
			}else {
				
				System.out.println("var3과 var4는 참조가 다름");
			}
			
			
			if(strVar3.equals(strVar4)) {
				System.out.println("var3과 var4는 문자열이 같음");
			}else {
				System.out.println("var3 과 var4는 문자열이 다름");
			}
	}

}
