package com.mycompany.study.ch03;

public class ExConditionalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ch03.10
//		삼항 연산자 (조건식) ? A : B
		
		int math = 85;
		
		char grade = (math>90) ? 'A' : 'B';		// True면 A, False면 B
		System.out.println("grade: " + grade);
		
		if(math > 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		System.out.println("grade: " + grade);
	
		String grade2 = (math>90) ? "합격" : "불합격";
		System.out.println("grade2: " + grade2);
		
	}

}
