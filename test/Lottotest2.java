

package com.jh.test;


import java.util.Random;

public class Lottotest2 {

	public static void main(String[] args) {

		
		
		int GetLotto[] = new int[6]; //번호가 여섯개나오니까 6칸짜리 숫자를넣을거임
		
		Random Rl = new Random(); //따블클릭 많이하니 임포트랜덤 등장6
		
		for(int i =0; i<6; i++) {
			
			GetLotto[i] = Rl.nextInt(45)+1;
			for(int j = 0; j<i; j++){
				if(GetLotto[i] == GetLotto[j]) // 이부분이 중복이면 i 에서 -1 때리라는거 
					i--;											//
				
				}
		}
		
				for(int i =0; i <6; i++)
		System.out.println(GetLotto[i] + " ");
	}

}
