package com.jh.test;

public class testlogIn00 {

	public static void main(String[] args) {

		//javascript > JSP > JAVA 넘어왓다는 가정
		//로그인 화면에서 입력한 테이터가 이곳까지 도착햇다라고 가정하고 로그인이 정상적으로 되면 
		//정상접속 메세지 출력 아니면 비정상 메세지 출력
		
		String[] user = {"urid","urpass"};//db로 가정
		
		String Id = user[0];
		String Ps = user[1];
		
		
		if (user[0].equals(Id)) {			
			System.out.println("아이디가 정상입니다 " +Id);
		if (user[1].equals(Ps)) {
				System.out.println("아이디와 비밀번호가 같습니다 정상! " +Ps);
		}
		
		}else {
			System.out.println("정상적인 접속이 아닙니다");
		}
	}

}
