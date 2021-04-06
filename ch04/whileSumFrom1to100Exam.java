package com.jh.ch04;

public class whileSumFrom1to100Exam {

	public static void main(String[] args) {

		int sum= 0;
		int i = 1;
		
		
		while (i<=100) {
			
			sum += i;
			i++;
		}
		
		System.out.println("1~" +(i-1)+" гу:"+sum);
		
	}

}
