package com.mycompany.study.ch02;

public class ExBoolean {

	public static void main(String[] args) {
		
		// 선언
		// 변수명은 defaultNy 로 불리언 변수 선언
		boolean defaultNy;
		
		
		// 초기화
		// 변수명은 default1Ny로 불리언 변수 선언 초기값은 true
		boolean default1Ny = true;
		
		// 변수명은 default2Ny로 불리언 변수 선언 초기값은 false
		boolean default2Ny = false;
		
		// default1Ny값이 참이면 "기본값입니다." 아니면 "여분값입니다." 출력 하시요
		
		// 괄호안이 참이면 if 구문 아니면 else 구문
		if (default1Ny) {
			System.out.println ("기본값입니다.");
		} else {
			System.out.println ("여분값입니다.");
		}
		
	}

}
