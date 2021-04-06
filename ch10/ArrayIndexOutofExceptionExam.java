package com.jh.ch10;

public class ArrayIndexOutofExceptionExam {

	public static void main(String[] args) {

		
		if(args.length ==2 ) {
			System.out.println("값을 넣어 다시 해주세요");
		
		
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] :" + data1);
			System.out.println("args[1] :" + data2);
		
		}else {

			System.out.println(":실행방법:" );
			System.out.println("JAVA ArrayIndexOutOfBoundsException");
			System.out.println("값1 값2");
				
		}
		
		
			
	}

}
