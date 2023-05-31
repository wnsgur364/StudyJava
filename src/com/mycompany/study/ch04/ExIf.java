package com.mycompany.study.ch04;

public class ExIf {

	public static void main(String[] args) {
//		ch04.01
//		if - 학점 계산
		
		int score = 87;
		
		if (score >= 100 || score >= 97){
			System.out.println("당신의 학점은 A+ 입니다.");
		} else if (score > 97 || score > 93) {
			System.out.println("당신의 학점은 A 입니다.");
		} else if (score >= 93 || score >= 90){
			System.out.println("당신의 학점은 A- 입니다.");
		} else if (score >= 89 || score >= 87) {
			System.out.println("당신의 학점은 B+ 입니다.");
		} else if (score > 86 || score > 83) {
			System.out.println("당신의 학점은 B 입니다.");
		} else if (score >= 83 || score >= 80) {
			System.out.println("당신의 학점은 B- 입니다.");
		} else if (score >= 79 || score >= 77) {
			System.out.println("당신의 학점은 C+ 입니다.");
		} else if (score > 77 || score > 73) {
			System.out.println("당신의 학점은 C 입니다.");
		} else if (score >= 73 || score >= 70) {
			System.out.println("당신의 학점은 C- 입니다.");
		} else if (score >= 69 || score >= 67) {
			System.out.println("당신의 학점은 D+ 입니다.");
		} else if (score > 67 || score > 63) {
			System.out.println("당신의 학점은 D 입니다.");
		} else if (score >= 63 || score >= 60) {
			System.out.println("당신의 학점은 D- 입니다.");
		} else {
			System.out.println("당신의 학점은 F 입니다.");
		}
		
		int score2 = 83;
		
		if (score2 >= 90) {
			if (score2 >= 97) {
				System.out.println("A+");
			} else if (score2 >=93) {
				System.out.println("A");
			} else {
				System.out.println("A-");
			}
		} else if (score2 >= 80) {
			if (score2 >= 87) {
				System.out.println("B+");
			} else if (score2 >= 83) {
				System.out.println("B");
			} else {
				System.out.println("B-");
			}
		}
	
	}

}

