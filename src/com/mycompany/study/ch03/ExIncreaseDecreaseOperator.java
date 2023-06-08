package com.mycompany.study.ch03;

public class ExIncreaseDecreaseOperator {

	public static void main(String[] args) {
//		ch03.04	
//		증감 연산
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("--------------");
	
		int k = i++; // i를 k에 대입, i를 1증감
		int m = ++j; // j를 1증가, j를 m에 대입
		
		System.out.println("k: " + k);
		System.out.println("i: " + i);
		System.out.println("m: " + m);
		System.out.println("j: " + j);
		System.out.println("--------------");
		
		--i;
		int z = ++i + j++;
		
		System.out.println("z: " + z);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("--------------");
		
		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	
		
	}

}
