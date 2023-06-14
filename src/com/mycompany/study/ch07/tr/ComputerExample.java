package com.mycompany.study.ch07.tr;

public class ComputerExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		calculator.radius = 7;
		double pai1 = calculator.param(calculator.radius);
		double pai2 = computer.param(calculator.radius);
		
		System.out.println("원의 반지름: " + (int) calculator.radius);
		System.out.println();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println(pai1) ;
		System.out.println();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println(pai2);
		System.out.println();
		
	}

}
