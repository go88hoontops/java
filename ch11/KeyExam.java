package com.jh.ch11;

import java.util.HashMap;

public class KeyExam {

	public static void main(String[] args) {
		//객체를 식별키로 사용하여  String 값을 저장하는 hashmap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new key(1)으로 이름저장.
		hashMap.put(new Key(1),"이정훈");
		
		
		//식별키 new Key(1)으로 이름읽어봄
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		
		
		
		
		
		//책 462p
		//해쉬코드의 관해서 다시읽어봐야함
		//
	
	
	}

}
