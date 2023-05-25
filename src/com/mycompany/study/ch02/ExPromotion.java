package com.mycompany.study.ch02;

public class ExPromotion {

	public static void main(String[] args) {

//		byte < short < int < long < float < double
		
		byte byteVar = 10;
		System.out.println("byteVar: " + byteVar);
		
		short shortVar = byteVar;
		System.out.println("shortVar: " + shortVar);
		
		int intVar = shortVar;
		System.out.println("intVar: " + intVar);
		
		long longVar = intVar;
		System.out.println("longVar: " + longVar);
		
		float floatVar = longVar;
		System.out.println("floatVar: " + floatVar);
		
		double doubleVar = floatVar;
		System.out.println("doubleVar: " + doubleVar);
	}

}
