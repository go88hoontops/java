package com.jh.ch07;

public class AnimalExam {

	public static void main (String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
	
		dog.sound();
		cat.sound();
		System.out.println("-------");
	
	//변수 자동타입변환 봐.
		
		Animal animal= null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("----------");
	
		//메소드의 다형성
	
		animalSound (new Dog());
		animalSound (new Cat());
	}//<<닫는거 잘봐야함 바로위같은 메소드는 해당클래스 밖에있는거가져오니까?
	
		public static void animalSound(Animal animal) {
			animal.sound();
		}
		
	
	
}
