package com.jh.ch08;

public class CarExam {

	public static void main(String[] args) {
		
		Car myc = new Car();
		
		myc.run();
		
		myc.frontLeftTire = new KeumhoTire();
		myc.backLeftTire = new KeumhoTire();
		
		myc.run();
	}
}
