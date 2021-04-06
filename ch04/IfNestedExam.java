package com.jh.ch04;

public class IfNestedExam {

	public static void main(String[] args) {

		int Score = (int)(Math.random()*20) +81;
		System.out.println("점수 : " + Score);
		
		
		
		String grade = null;//초기화 안하니까 오류남.
		
		if(Score >= 90) {
			if(Score >95) {
				grade = "A+";
			}else {
				grade ="A";
			}
		}else {
				if(Score >=80){
				if(Score >=85) {
						grade ="B+";
			}
				
				else {
						grade="B";
			}
				}
				
				
			}
		
		System.out.println("학점 : = " + grade);
		} 
	}


