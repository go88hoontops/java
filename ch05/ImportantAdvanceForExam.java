package com.jh.ch05;

public class ImportantAdvanceForExam {

	public static void main(String[] args) {

		
		int scores[] = {96, 99, 94, 92, 91};
		
		int sum = 0;
		for (int score : scores) {
			
			sum = sum + score;
		}
		
		System.out.println("Á¡¼ö ÃÑÇÕ = " + sum);
		
		double avg = (double)sum/scores.length;
				System.out.println("Æò±Õ Á¡¼ö = " + avg);
	}

}
 