package com.jh.ch10;

public class ClassCastExceptionExam {

	
	
	public static void main(String[] args) {

		Dog dog = new Dog();
		changeDog(dog);
	
		try {
		Cat cat = new Cat();
		changeDog(cat);
		}catch(Exception e) {
			System.out.println("ClasscastException 발생");
		}
		finally {
		System.out.println("수정때림 ㅋ");	
		
		}
	}		
		
		public static void changeDog(Animal animal){
			
			
			//if(animal instanceof Dog) {
				Dog dog = (Dog) animal;
			//}else {
				
			}

		}
	
		class Animal{}
		class Dog extends Animal{}
		class Cat extends Animal{	}
		
	

