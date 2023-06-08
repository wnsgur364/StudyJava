package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		
//		kor, eng, math 과목별 총합과 평균
//		사람별 총합과 평균
		
		String[] name = {"유동근", "유해진", "유지태", "유산균", "유인나"};
		
		int[][] score = {{99,98,55}, {42,12,23}, {12,99,45}, {98,67,52}, {24,18,15}};
		
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				System.out.println("score["+i+"]["+j+"]: " + score[i][j]);
			}
			System.out.println("-----------------");
		}
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		for (int i=0; i<score.length; i++) {
			kor += score[i][0];
			eng += score[i][1];
			math += score[i][2];
		}
		
		System.out.println("국어 총점: " + kor + ", 국어 평균: " + kor / score.length + " / eng 총점: " + eng +  ", eng 평균:" + eng / score.length + " / math 총점: " + math + ", math 평균: " + math / score.length);
		System.out.println("-------------------------------------------------------------------------------------------");
		
		int[] sum = new int[name.length];
		for (int i = 0; i < name.length; i++) {
		  for (int j = 0; j < score[i].length; j++) {
		    sum[i] += score[i][j];
		  }
		}
		
		double[] avg= new double[name.length];
		for (int i = 0; i < name.length; i++) {
		  avg[i] = (double) sum[i] / score[i].length;
		}

		for (int i = 0; i < name.length; i++) {
		  System.out.println(name[i] + "의 총점은 " + sum[i] + ", 평균은 " + avg[i] + "입니다.");
		  System.out.println(" ");
		}
		
	}

}
