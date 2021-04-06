package com.jh.ch07;

public class Computer extends Calculator {
	
	 @Override
	 double areaCircle(double r) {
		 System.out.println("Coputer °´Ã¤(class)ÀÇ areaCircle() ½ÇÇà");
		 
		 return Math.PI * r * r;
	 }
	
}