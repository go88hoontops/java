package com.jh.ch06;

public class Computer {

	int sum1(int[] values){
								//배열로 받아서 정수로 리턴.
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
			
		}
		return sum;
	}
								//정수로 받아서 정수리턴
	int sum2(int ...values) {
		int sum= 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {

		Computer computer = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = computer.sum1(values1);
		System.out.println("result 1 : " + result1 );
		
		int result2 = computer.sum2(new int[] {1,2,3,4,5});
		System.out.println("result 2 : " + result2 );
		
		int result3 = computer.sum2(1,2,3);
		System.out.println("result 3 : " + result3 );
		
		int result4 = computer.sum2(1,2,3,4,5);
		System.out.println("result 4 : " + result4 );
		
				
			
	}

	
}
