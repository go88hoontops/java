package com.jh.ch11;
//finalize() 객체소멸자??
public class Counter {

		private int  no;
		
		public Counter (int no) {
			this.no = no;	
		}
		
		@Override
		protected void finalize() throws Throwable{
			System.out.println(no + 	"번 객체의 fibalize() 가 실행됨");
		
		}
	
}
