package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {

		TrGugu trGugu = new TrGugu();
		
		try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			
			while (number >= 1 && number <= 9) {
				trGugu.gugudan(number);
				number = scanner.nextInt();
			}
		}
	    System.out.println("잘못된 값을 입력했습니다.");
	}

}