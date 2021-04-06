package com.jh.ch07;

public class SuperSonicExam {

	public static void main(String[] args) {

		SupersonicAirplane supersonicAirplane =new SupersonicAirplane();
		
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = supersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode=supersonicAirplane.NOMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();	
		
		
		
	}

}
