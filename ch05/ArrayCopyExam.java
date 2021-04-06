package com.jh.ch05;

public class ArrayCopyExam {

	public static void main(String[] args) {

		String[] oldArrayStr = { "java", "array","copy"};
		String[] newArrayStr = new String[5];
		
		
		System.arraycopy(oldArrayStr, 0, newArrayStr, 0, oldArrayStr.length);
		
		
		for(int i = 0; i < newArrayStr.length; i++) {
			
			System.out.println(newArrayStr[i] + ",");
		}
		
	}

}
