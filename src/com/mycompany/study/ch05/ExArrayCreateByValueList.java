package com.mycompany.study.ch05;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {

//		int[][][] scoreEnglish;
//		int scoreMath[][][];
//		
//		String[] name;
//		String name2[];
//		
//		double[] total;
//		double avg[];
//		
//		char[] grade232301;
//		char grade232302[];
//		
//		boolean[] score;
//		boolean score2[];
		
		int[] scoreChemistry = {100,99,98,97,96,95,94};
		
//		scoreChemistry[7] = 93;		컴파일 에러
		scoreChemistry[0] = 0;
		scoreChemistry[1] = 40;
		scoreChemistry[2] = 66;
		scoreChemistry[3] = 34;
		scoreChemistry[4] = 63;
		scoreChemistry[5] = 89;
		scoreChemistry[6] = 100;
		
		String[] scoreStudent = {"일준혁","이준혁","삼준혁","사준혁","오준혁", "육준혁"};
		char[] scoreGrade = {'A', 'B', 'C', 'D', 'E', 'F'};
		
//		int[] scorePhysics;
//		scorePhysics = {100,99,98,97,96};	error
//		선언과 동시에 초기화
		
//		System.out.println(scoreChemistry.length);
//		
//		System.out.println("---");
//		
//		System.out.println(scoreChemistry[0]);
//		System.out.println(scoreChemistry[4]);
//		
		System.out.println("for문");
		int sum = 0;
		for(int i=0; i<scoreChemistry.length; i++) {
			System.out.println(scoreChemistry[i]);
			sum += scoreChemistry[i];
		}
		System.out.println("합계: " + sum);
//		
//		System.out.println("while문");
//		
//		int i = 0;
//		while (i<scoreChemistry.length) {
//			System.out.println(scoreChemistry[i]);
//			i++;
//		}
//		
//		System.out.println("향상된 for문");
//		
//		for (int j: scoreChemistry) {
//			System.out.println(j);
//		}
//		
//		System.out.println("---");
//		
//		for(char k: scoreGrade) {
//			System.out.println(k);
//		}
//		
//		System.out.println("-----------------------------");
//		
//		for(String b: scoreStudent) {
//			System.out.println(b);
//		}
//		
//		int sum=0;
//		for (int j=0; j<scoreChemistry.length; j++) {
//			sum += scoreChemistry[j];
//			System.out.println("각 점수는: " + scoreChemistry[j] + " | " +"총합은: " + sum);
//		}
//		
//		System.out.println("-----------------------------");
//		
//		int c=0;
//		int sum2=0;
//		while (c<scoreChemistry.length) {
//			sum2 += scoreChemistry[c];
//			System.out.println("각 점수는: " + scoreChemistry[c] + " | " +"총합은: " + sum2);
//			c++;
//		}
//		
//		System.out.println("-----------------------------");
//		
//		int sum3 = 0;
//		for (int k: scoreChemistry) {
//			sum3 += k;
//			System.out.println("각 점수는: " + k + " | " +"총합은: " + sum3);
//		}
		
	}

}
