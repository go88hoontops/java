package com.jh.ch06;

public class Television {

	static String brand = "SAMSUNG" ;
	static String model = "lcd" ;
	static String info ;
	
	
	
	static {
	
		info = brand + "-" + model;

	}

	public static void main(String[] args) {

		System.out.println(Television.info);
		
		
	}

}
