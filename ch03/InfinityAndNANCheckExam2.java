package com.jh.ch03;

public class InfinityAndNANCheckExam2 {

	public static void main(String[] args) {

		String userInput = "NAN";
		double val = Double.valueOf( userInput );
		
		
		double currentBalance = 10000.0;
		
		currentBalance += val ;
		
		System.out.println(currentBalance);
 		
	}

}//85p 뭐가문제야 이건?

