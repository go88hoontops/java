package com.jh.ch06;


public class Singleton {

	
	private static Singleton singleton = new Singleton();
	
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		
		
		return singleton;
	}
	
	public static void main(String[] args) {

		
		
		
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();


		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		
		if (obj1 ==obj2) {
			System.out.println("같은 singleton 객체입니다");
		}else {
			System.out.println("다른 singleton 객체입니다.");
		}
		
		if (obj3 ==obj4) {
			System.out.println("같은 singleton 객체입니다");
		}else {
			System.out.println("다른 singleton 객체입니다.");
		}
		
	}

}
