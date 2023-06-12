package com.mycompany.study.ch06.sixth;

public class Television {

	public static String company = "럭키금성";
	public static String model = "VD-191";
	public static String companyModel = company + ":" + model;
	public static String info;
	
	static {
		info = company + ":" + model;
		abc();
//		efg();  // static block 안에는 static 함수와 변수만 사용 가능
	}
	
	public static void abc() {
		System.out.println("abc()");
	}
	
	public void efg() {
		System.out.println("efg()");
	}
	
}
