package com.training;
//Types of variable
class Animal
{
	int age;	//instance variable
	static int animalCount;	//class variable	
	public void roam() {
		
	}
	public void eat()			//both static 
	{
		roam();
		int drink=10;			//local variable	
		System.out.println("Animal age is :"+age);		//		
        System.out.println("Animal drinks water in liter :"+drink);
        System.out.println("Total :"+age+drink);
        age++;
        animalCount++;
	}
	public static void walk() {
		//only static variables
		animalCount++;
	}
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		a1.age++;			//1
		a1.animalCount++;	//1
		a1.eat();			
		walk();
		System.out.println(a1.age);				
		System.out.println(a2.age);
		System.out.println(Animal.animalCount);
	}
	
}