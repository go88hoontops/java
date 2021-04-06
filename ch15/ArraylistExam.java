package com.jh.ch15;
import java.util.*;
public class ArraylistExam {

	public static void main (String[] args) {
	
		
		List<String> list = new ArrayList<String>();
	list.add("JAVA"); 
	list.add("John"); 
	list.add("Nah"); 
	list.add("Uh"); 
	list.add("Roy"); 
	list.add("Wa"); 
	
	int size = list.size();
	for(int i = 0 ; i<list.size();i++) {
	String str = list.get(i);	
		System.out.println(i + "번째 : " +str);
		}
	
		System.out.println();
		System.out.println("isContain :" + list.contains("Nah")); //true
		
	list.remove(4);
	list.remove("Wa");
	
	System.out.println("isEmpty :" + list.isEmpty());//false

	for(int i = 0 ; i<list.size();i++) {
		String str = list.get(i);	
		System.out.println(i + "번째 : " +str);
	}
	
	list.clear();// 초기화..
	System.out.println("isEmpty :" + list.isEmpty());//false
	
	
	}
}
