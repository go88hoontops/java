package com.jh.ch15;
import java.util.*;

public class LinkedListExam {

	public static void main(String[] args) {

		List<String> javas = new ArrayList<String>();
		List<String> javas1 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i =0; i<10000; i++) {
			javas.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i =0; i<10000; i++) {
			javas1.add(0, String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("LinkedList 소요시간 : " + (endTime - startTime) + "ns");;
				
		
		
	}

}
