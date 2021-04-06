package com.jh.ch06;

public class Person {

	final String nation = "KOREA";
	final String ssn;
	String name;
	
	
	public Person(String ssn , String name) {
		
		this.ssn = ssn;
		this.name = name;
	}
	
	public static void main(String[] args) {

		
		Person p1 =new Person("1123455-44332212", "가마니");
	
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "귀엽노";
		System.out.println(p1.name);
//		p1.nation = "usa";
	}

}
