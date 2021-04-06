package com.jh.ch11;

public class Member {

	public String id; //필드
	
	//생성자
	public Member(String id) {
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
				
			}
		}
		return false;
	}
	@Override //추가됨 위의 내용은 불리언값으로 리턴하고, 아래는 정수형 리턴.
	//
	public int hashCode() {
		return id.hashCode();
	}

}
