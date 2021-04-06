package com.jh.test;

public class TestTitle {

	
	//for문? 멀티 어레이.... 뇌정지
	//이거 좀더 봐야함
	public static void main(String[] args) {
		
		//
		//
										//1 J
										//2
		
		String[][] title = {
									{"[필독]","띵글 스톡체험판 이렇게 사용하세요~" ,"라온 정달", "2020.09.02","261"},
									{"[공지] ","일요일 오후 9시 방송 시작합니다.", "프로그","2020.12.27", "34"},
									{"[필독] ","2020년 12월 신규 탐험대를 모집합니다.","라온 정달","2020.12.03","54,"},
									{"[공지] ","프로그 지분 15구좌 양도합니다." , "프로그", "2020,10.27","262"},
									{"[공지] ","프로그 차트 특허 등록 완료되었습니다","프로그","2020.09.30", "248"},
									{"[필독] ","신입 회원 필독사항 입니다", "프로그", "2020.03.03" ,"1731"}
			//..몇개더..								
		};
		
		
		for(int i=0; i<title.length;i++) {
			
			for(int j=0; j<title[i].length; j++) {
			
			//System.out.println(title[i][j]);	 i 하고 j가 바뀌면 세로로 묶여서 출력됨
				System.out.print(title[i][j]+"\t");
			}
		
			System.out.println();
		}
		
		
		
		//카페 공지 노출시키기
		//https://cafe.naver.com/progue
		
		
	}

}
