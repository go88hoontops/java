package com.jh.ch11;


public class MemberExam1 {

	public static void main(String[] args) {

		//원본객체부터 생성하고
		//Member1 을 사용
		Member1 original = new Member1("RED","이름","24241",24,true);
		
		//복제객체를 얻은후에 패스워드 변경
		
		Member1 cloned = original.getMember();
		
		cloned.password ="12451"; //복제한 객체에서 비번수정(인덱스3)
		
		System.out.println("[복제객체의 필드값]");
		System.out.println("ID : " + cloned.id);
		System.out.println("NAME : "+ cloned.name);
		System.out.println("PASSWORD: "+ cloned.password);
		System.out.println("AGE: "+ cloned.age);
		System.out.println("ADULT: "+ cloned.adult);
		
		System.out.println("-----------------------------");
		
		
		System.out.println("[원본객체의 필드값]");
		System.out.println("ID : " + original.id);
		System.out.println("NAME : "+ original.name);
		System.out.println("PASSWORD: "+ original.password);
		System.out.println("AGE: "+ original.age);
		System.out.println("ADULT: "+ original.adult);
		
	}

}
