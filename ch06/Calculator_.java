package com.jh.ch06;

public class Calculator_ {
	
		int puls(int x, int y) {
			
			int result = x+y;			
						
			return result;
		}
		
		double avg (int x, int y) {
			
			double sum = puls(x, y);
			double result = sum / 2 ;
			
		
			return  result;
		}
	
	
		void execute() {
			double result = avg (9,10);
			
			println("실행결과 :"+result);
		}
	
		
		void executecall(int x, int y) {
			
			double sum = x + y;
			double result = sum/2;
			

			println("result = " + result);
			
		}
		
		void println(String message) {
		
			System.out.println(message);
		
		}
	
		public static void main (String[] args) {
			
			Calculator_ calculator_ = new Calculator_();
		
			calculator_.executecall(10,9);
		
		}

}
