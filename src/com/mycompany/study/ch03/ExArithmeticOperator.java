package com.mycompany.study.ch03;

public class ExArithmeticOperator {

	public static void main(String[] args) {
//		ch03.01
//		산술 연산자
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);		
		System.out.println("result3: " + result3);		
		System.out.println("result4: " + result4);		
		System.out.println("result5: " + result5);		
		
		double result6 = (double)v1 / v2;
		System.out.println("result6: " + result6);
		
	}

}
