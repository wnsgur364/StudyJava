package com.mycompany.study.ch04;

public class ExFor {

	public static void main(String[] args) {

//		2단 부터 출력 되는 구구단 프로그램을 작성하시오
//		2 * 1 = 2
		
		for (int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("-----------");
		}
	}
}