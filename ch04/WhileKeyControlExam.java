package com.jh.ch04;

import java.io.IOException;

public class WhileKeyControlExam {

	public static void main(String[] args) throws IOException {

		
		
			boolean run = true;
			int speed = 0;
			int keycode = 0;
			
			
		while(run) {
			
			if(keycode !=13 && keycode != 10) {
				System.out.println("==========");
				System.out.println("1.증속 : 2.감속 : 3.중지");
				System.out.println("==========");
				System.out.println("선택 : ");
					
			}
			
			
			keycode = System.in.read();
			
			if (keycode == 49) {
				speed++;
				System.out.println(" 현재속도 =" +speed);
			}else if(keycode ==50) {
				speed --;
				System.out.println(" 현재속도 =" +speed);
			}else if (keycode ==51) {
				run = false;
				
			}
		}
		
		System.out.println("종료");
		
	}

}
