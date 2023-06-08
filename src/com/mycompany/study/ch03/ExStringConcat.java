package com.mycompany.study.ch03;

public class ExStringConcat {

	public static void main(String[] args) {
//		ch03.06
//		문자열 연산자
		
		String stringVal = "jdk";
		String stringVal2 = "1.11";		
		String stringVal3 = stringVal + stringVal2;
		
		System.out.println("stringVal3: " + stringVal3);
		System.out.println("우리가 사용하는 jdk 버전은: " + stringVal + " " + stringVal2 + " 입니다.");
	
		int a = 1;		
		String stringVal4 = stringVal + a;	
		
		System.out.println("stringVal4: " + stringVal4);
		
		double b = 1.11;		
		String stringVal5 = stringVal + b;		
		
		System.out.println("stringVal5: " + stringVal5);
		
	}

}
	