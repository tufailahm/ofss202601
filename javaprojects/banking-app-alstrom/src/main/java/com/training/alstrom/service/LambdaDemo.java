package com.training.alstrom.service;

interface MathProblem {
	int add(int num1, int num2);
}

public class LambdaDemo {

	public static void main(String[] args) {

		// Using Lambda
		MathProblem mathProblem2 = (num1, num2) -> num1 + num2;
		System.out.println(mathProblem2.add(20, 20));

		MathProblem mathProblem3 = (num1, num2) -> num1 * num2;
		System.out.println(mathProblem3.add(20, 20));

	}
}
