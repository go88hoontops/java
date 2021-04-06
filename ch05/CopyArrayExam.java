package com.jh.ch05;

public class CopyArrayExam {

	public static void main(String[] args) {

		
			String [] oldstrArray = {"JAVA","array","Copy"};
			String[] newstrArray = new String[5];
			
			System.arraycopy(oldstrArray, 0, newstrArray, 0, oldstrArray.length);
		
			
			for(int i =0 ;i < newstrArray.length;i++) {
				System.out.println(newstrArray[i] +"-");
			}
	}

}
