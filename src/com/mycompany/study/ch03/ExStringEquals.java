package com.mycompany.study.ch03;

public class ExStringEquals {

	public static void main(String[] args) {
//		ch03.07
//		문자열 관련
		
		String str1 = "이준혁";
		String str2 = "이준혁";
		String str3 = new String("이준혁");
		
		boolean result1 = (str1 == str2); 
		System.out.println("result1=" + result1);	// true
		
		boolean result2 = (str1 == str3); 
		System.out.println("result2=" + result2);	// false
//		문자열 값 비교
		System.out.println(str1.equals(str2));		// true
		System.out.println(str1.equals(str3));		// false
		
	}

}
