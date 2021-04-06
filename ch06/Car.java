package com.jh.ch06;
//field 
public class Car {

//	String company = "현대차";
//	String model = "그랜저";
//	String color = "검정색";              //-기초 p200
//	int maxSpeed = 350;
//	int speed;

	String company = "현대차";
	String model ;
	String color ;						//p210 오버로딩
	int maxSpeed ;
	int speed;

	//=========================가스 체크 and 출력	
	int Gas;
	public void setGas(int gas) {
	this.Gas = gas;
		
	}
	
	public boolean isLeftGas(){
		if( Gas == 0) {
			System.out.println("가스없어");
			return false;
		}else {
			System.out.println("가스충분");
			return true;
		}
	}
	
	public void run() {
		while (true) {
			if(Gas > 0) {
				 System.out.println("전속력으로 밟아버렷! GAS 잔량 :" + Gas);
				 Gas -= 1;
			}else {
				System.out.println("멈춥니다! GAS 부족! " + Gas );
			return;
			}
		}
	}
	////========================================차량 오버로딩 (생성자)
	Car(){
		
	}
	Car(String model){
		this(model, "은색",99);
	}
	
	Car(String model, String color){
		this(model, "은색",99);
	}
	
	Car(String model, String color , int maxSpeed){
		
		this.model = model;
		this.color =color;
		this.maxSpeed=maxSpeed;
		
	}
	Car(String model, String color , int speed, int maxSpeed){
		
		this.model = model;
		this.color =color;
		this.speed = speed;
		this.maxSpeed=maxSpeed;
		
	}
	
	
	
	
	
	
	
	
	
	
//생성자 ver1 - 길게쓴거 ver2 짧게 수정/
	
//	Car(){
//		
//	}
//
//	Car(String model){
//		this.model = model;
//	}
//	
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
//	
//	Car(String model , String color, int maxSpeed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
//	
//	Car(String model , String color, int maxSpeed,String company ,int speed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//		this.company = company;
//		this.speed = speed;
//	}
//	
//	
	public static void main(String[] args) {
								

		Car caR = new Car();

		caR.setGas(5);   //caR 클래스 setgas 메소드 호출
		
		boolean gasState = caR.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			caR.run();
		}
		
		if (caR.isLeftGas()) {
			System.out.println("충분히 달린다");
		}else {
			System.out.println("기름을 채우시오!!");
		}
		
		
		System.out.println("caR.company : " + caR.company );
		System.out.println();
														//생성자 선택후 사용
		Car car1 = new Car();                          ////1번 생성자 상단확인
		System.out.println("car1.company : " + car1.company );
		System.out.println();
		
		Car car2 = new Car("자가용");
		
		System.out.println("car2.company : " + car2.company );
		System.out.println("car2.model : " + car2.model );
		System.out.println();
		

		Car car3 = new Car("자가용", "빨강");
		
		System.out.println("car3.company : " + car3.company );
		System.out.println("car3.model : " + car3.model );
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("자가용", "빨강", 99);
		
		
		System.out.println("car4.company : " + car4.company );
		System.out.println("car4.model : " + car4.model );
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
	
		Car car5 = new Car("자가용","빨강",89,500);
		
		System.out.println("car5.company : " + car5.company );
		System.out.println("car5.model : " + car5.model );
		System.out.println("car5.color : " + car5.color);
		System.out.println("car5.speed : " + car5.speed);
		System.out.println("car5.maxSpeed : " + car5.maxSpeed);
	
		
		
		//		//객채 car 생성 이건 Car 클래스를 참조함
//		Car car = new Car();
//															===p200 처음부분	
//		
//		//Car class 에서 선언한것들 불러올수있음.
//		System.out.println("제작회사 : " + car.company);
//		System.out.println("모델명 : " + car.model);
//		System.out.println("차량색상 : " + car.color);
//		System.out.println("차랑 최고속도 : " + car.maxSpeed );
//		System.out.println("차량 현재속도 : " + car.speed);
//		
//	
//		
//		//필드값을 변경할수있음.
//		car.speed = 60;
//	
//		System.out.println("수정된. 현재속도 : " + car.speed);
//		

	
	}
}
