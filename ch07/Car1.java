package com.jh.ch07;

public class Car1 {

	Tire[] tires = {
		//필드
		new Tire ("앞좌측", 6),
		new Tire ("앞우측", 2),
		new Tire ("뒤좌측", 3),
		new Tire ("뒤우측", 5),
		 
	};
	
	//메소드
	int run() {
			System.out.println("자동차가 gogogo");
			for(int i=0;i<tires.length;i++) {
				if(tires[i].roll() == false) {
					stop();
					return(i+1);
				}
			}
	
			return 0;
	}
	
	void stop() {
		System.out.println("차가멈춥니다.");
	}
}
