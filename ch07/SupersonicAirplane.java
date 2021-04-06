package com.jh.ch07;

public class SupersonicAirplane extends Airplane{

	
	public static final int NOMAL =1;
	public static final int SUPERSONIC =2;
	
		public int flyMode = NOMAL;
		
		@Override
		public void fly() {
			if(flyMode ==SUPERSONIC) {
				System.out.println("초음속비행중");
			}else {
				super.fly();
			}
			
		}
	
}
