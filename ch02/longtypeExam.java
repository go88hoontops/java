package com.jh.ch02;

public class longtypeExam {

	public static void main(String[] args) {

		
			long va1 = 10;
			long va2 = 20L;
			//long va3 = 10000000000000;
			long va4 = -111111100000000000L;
			
			
			//va3 은 롱타입 이고 인트저장범위 이상이라 롱타입 사용하고 뒤에  'L' (지정하지않아서 오류남
			
			 System.out.println(va1 + "\t"+ va2 + "\t" + va4);
	}

}
