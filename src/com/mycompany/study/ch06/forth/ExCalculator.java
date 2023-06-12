package com.mycompany.study.ch06.forth;

public class ExCalculator {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		double result = calculator.areaSquare(5);
		double result2 = calculator.areaSquare(5, 6);
		
		System.out.println(result);
		System.out.println(result2);
	}

}
