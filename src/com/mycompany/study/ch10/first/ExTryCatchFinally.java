package com.mycompany.study.ch10.first;

public class ExTryCatchFinally {

	public static void main(String[] args){
		
//		Class clazz = Class.forName("ExTry");
		
		try {
			Class clazz = Class.forName("ExTry");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없으니 다른것으로 해주세요.");
		}
		
	}
	
}
