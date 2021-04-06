package com.jh.ch05;

public class ArrayCopyByForExam {

	public static void main(String[] args) {

		int[] oldIntArray = {1,2,3};
		int[] NewArray = new int[5];
		
		for(int i =0; i<oldIntArray.length;i++) {
			NewArray[i] = oldIntArray[i];
		}
		
		for (int i=0; i<NewArray.length;i++) {
			System.out.println(NewArray[i] + ",");
		}
		
	}

}
