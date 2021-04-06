package com.jh.ch06;

public class Earth {

	static final double Earth_Radius = 6400;
	static final double Earth_Surface_Area;
	
	
	static {
		Earth_Surface_Area = 4 * Math.PI * Earth_Radius * Earth_Radius;
	}
	
	void print (String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {

		Earth earth = new Earth();
		
		
		earth.print("지구의 반지름 : " +earth.Earth_Radius + "km");
		earth.print("지구의 표면적 : " +earth.Earth_Surface_Area + "km^2");
		
		
	}

}
