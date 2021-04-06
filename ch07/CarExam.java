package com.jh.ch07;

class CarExam {

	public static void main(String[] args) {

		Car car = new Car();
		
		
		for(int i=1;i<=5; i++) {
			int problemLocation = car.run();
			
			
			switch (problemLocation) {
			
			case 1:
				System.out.println("앞좣측 hankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞좌측",15);
				break;
			
			case 2:
				System.out.println("앞우측 KeumhoTire로 교체");
				car.frontRightTire = new HankookTire("앞우측",13);
						break;
				
			case 3:
				System.out.println("뒤좌측 hankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤좌측",14);
						break;
				
			case 4:
				System.out.println("뒤우측 KeumhoTire로 교체");
				car.backRightTire = new HankookTire("뒤우측",17);
						break;
				
			}
			System.out.println("-------------------");
			
			
		}
		
	}

}
