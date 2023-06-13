package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {

		TrGugu trGugu = new TrGugu();
		
		Scanner scanner = new Scanner(System.in); 
		
		int number = scanner.nextInt();
		
		while (trGugu.t) {
			trGugu.gugudan(number);
			number = scanner.nextInt();
			
			if (number != 0) {
				trGugu.gugudan(number);
			} else {
				System.out.println("프로그램 종료.");
				trGugu.t = false;
			}
		}
		
	}
	
}