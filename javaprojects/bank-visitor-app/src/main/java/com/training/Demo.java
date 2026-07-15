package com.training;
//Operator
public class Demo {

	public static void main(String[] args) {
		
		int num1 = 99;
		int num2 = 12;
		
		int num3 = 1;
		num3 = ++num2;
		num1 = num3--;
		num2 += 20;
		
		System.out.println("Num1 :"+ num1);			//13
		System.out.println("Num2 :"+ num2++);		//33
		System.out.println("Num3 :"+ --num3);		//11
		
		System.out.println(num1+num2+num3);			//58
		System.out.println(num1++ + " , " + --num1 + " , 	" );// 13, 13 ,
		
	}
}
