package com.jh.ch15;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExam {
// list.add 나 remove 가 불가능한 Arrays.asList
	public static void main(String[] args) {

		List<String> list1 =Arrays.asList("자바년","개빡쎄","쫘증나");

	
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,5,7,4,2);
		
		for(Integer value : list2) {
			System.out.println(value);
		}
		
		
	}

}
