package com.mycompany.study.ch04;

public class ExWhile {

	public static void main(String[] args) {

//		1부터 10까지 더하는 프로그램 작성
		
		int i=1;
		int sum=0;
		
		while (i <= 10) {
			sum += i;
			System.out.println(i + " | " + sum);
			i++;
		}
		
		System.out.println("Total Sum: " + sum);
		
	}
	
}
