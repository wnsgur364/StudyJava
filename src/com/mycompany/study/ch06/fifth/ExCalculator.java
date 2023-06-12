package com.mycompany.study.ch06.fifth;

public class ExCalculator {

	public static void main(String[] args) {

//		Calculator calculator = new Calculator();
		
//		int result = calculator.plus(1, 2);
//		int result2 = calculator.minus(1, 3);
		
		double result = 10 * Calculator.pi;
		System.out.println(result);
		
		int result1 = Calculator.plus(1, 2);
		int result2 = Calculator.minus(1, 3);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
