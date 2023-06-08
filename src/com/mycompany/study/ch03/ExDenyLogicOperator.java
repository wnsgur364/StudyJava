package com.mycompany.study.ch03;

public class ExDenyLogicOperator {

	public static void main(String[] args) {
//		ch03.03		
//		논리 부정 연산자 (i)
	
//		boolean play = true;
	
		boolean play = false;
		
		play = !play;
		
		System.out.println("play: " + play); 
		System.out.println("-------------");
		
		int i = 3;
		
		if( !(i == 3) ) { 
			System.out.println("뭔가를 해라!!");
		}
		
	}
}
