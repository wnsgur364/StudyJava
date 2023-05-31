package com.mycompany.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
//		ch04.02
//		일반:1, 	5% 할인적용 
//		브론즈:2, 	10% 할인적용 
//		실버:3, 	15% 할인적용 
//		골드:4,		20% 할인적용 
//		플레티넘:5,	2.7% 할인적용 
		
//		정가가 12,000원인 실버 등급의 할인가는: 10,200원 입니다.
		
		int grade = 3;
		int cost = 12000;
		double rate = 0;
		
		if (grade == 1) {
			rate = 5;
		} else if (grade == 2) {
			rate = 10;
		} else if (grade == 3) {
			rate = 15;
		} else if (grade == 4) {
			rate = 20;
		} else if (grade == 5) {
			rate = 2.7;	
		}	
		
		int price = (int) (cost - (cost * rate / 100));
		
		System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + price + "원 입니다.");
		
		if (grade == 1) {
			rate = cost * (1-0.05);
			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int)rate + "원 입니다.");
		} else if (grade == 2) {
			rate = cost * (1-0.1);
			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int)rate + "원 입니다.");
		} else if (grade == 3) {
			rate = cost * (1-0.15);
			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int)rate + "원 입니다.");
		} else if (grade == 4) {
			rate = cost * (1-0.2);
			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int)rate + "원 입니다.");
		} else if (grade == 5) {
			rate = cost * (1-0.027);
			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int)rate + "원 입니다.");
		} 
		
	}
	
}
