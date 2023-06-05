package com.mycompany.study.ch04;

public class ExForHigh {

	public static void main(String[] args) {

//		1.(10*5)
//		*********
//		*********		
//		*********		
//		*********		
//		*********
//		출력하는 프로그램을 만드시오.	
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		
//		2.(1, 5번째 출력)
//		*********
//		*       *	
//		*       *		
//		*       *		
//		*********
//		출력하는 프로그램을 만드시오.
		
		System.out.println("**********");
		System.out.println("*        *");
		System.out.println("*        *");
		System.out.println("*        *");
		System.out.println("**********");
		System.out.println("==========");

		for (int i=0; i<5; i++) {
			for (int j=0; j<10; j++) {
				if (i>0 && i<4) {
					if (j>0 && j<9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
		    }
			System.out.println();
		}
		System.out.println("==========");
		
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<i; j++) {
				System.out.print(j);
			} 
			System.out.println();
		} 
		
		for (int k=1; k<=5; k++) {
			System.out.print(k * 2 - 1);
			System.out.print(" ");
		}	
		System.out.println(0);
		
		System.out.println("==========");
		
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}
	
}
