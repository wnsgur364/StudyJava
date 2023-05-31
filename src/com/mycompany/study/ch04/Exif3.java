package com.mycompany.study.ch04;

public class Exif3 {

	public static void main(String[] args) {
//		ch04.03		
//		int 타입의 변수를 1개 선언하고
//		짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오
		
		int a = 0;
		
//		입력하신 3은 짝수 입니다.
		
		if ( a % 2 == 1) {
			System.out.println("입력하신 " + a + "은 홀수입니다.");
		} else if ( a % 2 == 0) {
			System.out.println("입력하신 " + a + "은 짝수입니다.");
		}
		
		if( a != 0 ) {
			if (a % 2 == 0 ) {
				System.out.println("입력하신 " + a + "은 짝수입니다.");
			} else {
				System.out.println("입력하신 " + a + "은 홀수입니다.");
			}
		} else {
			System.out.println("입력하신 " + a + "은 0입니다.");
		}
	}

}
