package com.jh.test;

public class Tinder {
// 클래스선언 및 필드역할(생성자)
	
	String joinMember = null; //회원가입
	
	String checkSnsAccount = null; //가입계정 타입= 구글 페북 전화번호 
	
	String googleIdCheck = null;// 구글일때
	String facebookIdCheck = null;// 페북일때
	String phoneNumberCheck = null;// 폰번호일때
	
	String checkPhoneNumber = null; // 본인인증확인
	String sendPriviteNumber = "";
	
	
	
	boolean checkOwnNumber(int rightnumber) {
		
		boolean checkPassnumber = false;
		
	
		if(rightnumber == 92838) {
			checkPassnumber = true;
			System.out.println("휴대본 본인인증완료");
		}else {
			System.out.println("인증번호를 확인하세요");
		}	
		return checkPassnumber;
	}
	
	
	
	String joinMember (String a) {
		
		String result = a;
		if (a.equals("google")) {
			System.out.println("구글로 회원가입");
		}else if (a.equals("facebook")) {
			System.out.println(" 페이스북으로 회원가입");
		}else if (a.equals("phoneNumber")){
			System.out.println(" 폰번호로 회원가입");
		}
		return result;
		}
	
	
	
	
	void matchPhoneNumber0 (int number) { //휴대폰번호로 본인인증
		
		int hisnumber = 0;
		
		if(hisnumber==number) {

			System.out.println("휴대폰으로 인증번호를 보냅니다");
		}else {
		}		
	}
//Method 클래스
	
	
	
	public static void main (String[] args) {
	
	Tinder tinder = new Tinder();
	tinder.joinMember("facebook"); //이부분이 회원가입 sns 구분
	tinder.checkOwnNumber(92838);
	tinder.matchPhoneNumber0(0101121112);
	
	}

	}

