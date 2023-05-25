package com.mycompany.study.ch02;

import javax.management.StringValueExp;

public class Exc0525 {

	public static void main(String[] args) {
		
		boolean defaultY = true;
		boolean defaultN = false;
		
		if (defaultY) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
		
		if (defaultN) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
		
		byte byteVar = -127;
		
		System.out.println("byteVar: " + byteVar);
		
		char charVar = '가';
		
		System.out.println("charVar: " + charVar);
		
		float floatVar = 10;
		double doubleVar = 20;
		
		System.out.println("floatVar: " + floatVar);
		System.out.println("doubleVar: " + doubleVar);
		
		int intVar = 1000;
		
		System.out.println("intVar: " + intVar);
		
		long longVar = 1231413142113L;
		
		System.out.println("longVar: " + longVar);
		
		byte bv = 10;
		
		System.out.println("bv: " + bv);
		
		short sv = bv;
		
		System.out.println("sv: " + sv);
		
		int iv = sv;
		
		System.out.println("iv: " + iv);
		
		long lv = iv;
		
		System.out.println("lv: " + lv);
		
		float fv = lv;
		
		System.out.println("fv: " + fv);
		
		double dv = fv;
		
		System.out.println("dv: " + dv);

		String text = String.valueOf(100);
		
		System.out.println("text: " + text);
		
//		예습
		
		int number = Integer.parseInt("100");
		
		System.out.println("number: " + number);
		
		double dn = number;
		
		System.out.println("dn: " + dn);
		
		String int1 = String.valueOf(number);
		
		System.out.println("int1: " + int1);
		
	}

}
