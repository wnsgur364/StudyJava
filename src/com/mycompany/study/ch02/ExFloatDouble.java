package com.mycompany.study.ch02;

public class ExFloatDouble {

	public static void main(String[] args) {

		double var1 = 3.0;
		double var2 = 3;
		
		double var3 = 3.14;
		float var4 = 3.14f;
		float var5 = 3.14F;
		
		double var6 = 1234567;		// ~7자리
		double var7 = 12345678;		// 8자리~ 1.2345678E7 > E = 10, 7 = 10의 -7제곱
		
		float var8 = 3;
		float var9 = 3f;
		float var10 = 3F;	
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
		System.out.println("var10: " + var10);
		
	}

}
