package com.jh.ch10;

public class NumberFormatExceptionExam {


	public static void main(String[] args) {

		try {
		String data1 = "100";
		String data2 = "a100";
	
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		
		int result = val1+val2;
		
		System.out.println(result +"=" +val1+"+"+val2);


		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("무언가 문제가있음.");
						
		}catch (NumberFormatException e) {

		
			System.out.println("무언가 문제가있음2.");
		}
		
		
		
		finally {
			System.out.println("다시해보시길");
		}
		
			
			
				
	
	}

}
