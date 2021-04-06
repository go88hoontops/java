package com.jh.ch06;

public class Airplane  {



	//필드
	String name;
	int speed;
	String departure;
	String cabincrew = "여성";
	

	
	//생성자
	Airplane (String s, String n, int a1){
			
		this.cabincrew = s;
		this.departure = n;
		this.speed = a1;
	}	

	Airplane (String n, String s, int o ,String a){
		
		this.cabincrew = n;
		this.departure = s;
		this.speed = o;
		this.name = a;
	}	

	
	
	public static void main(String[] args) {
											//6girls 가 위의 생성자 n = cabincrew로 오버로딩
		Airplane airplane = new Airplane("6girls","제주도",689,"대한항공");

		System.out.println("airplane.cabicrew : " + airplane.cabincrew);
		System.out.println("airplane.departure : " + airplane.departure);
		System.out.println("airplane.speed : " + airplane.speed);
		System.out.println("airplane.name : " + airplane.name);
		System.out.println();
	
		Airplane airplane1 = new Airplane("3mans & 6girls","제주도",689);
		
		System.out.println("airplane.cabiccrew : " + airplane1.cabincrew);
		System.out.println("airplane.departure : " + airplane1.departure);
		System.out.println("airplane.speed : " + airplane1.speed);
		System.out.println();
		
	
		
	}
}
