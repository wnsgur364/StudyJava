package com.mycompany.study.ch06.third;

public class ExArithmetic {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		
		int add = arithmetic.add(1, 2);
		int sub = arithmetic.sub(3, 7);
		int mul = arithmetic.mul(9, 8);
		int div = arithmetic.div(9, 3);
		
		System.out.println("더하기: " + add);
		System.out.println("빼기: " + sub);
		System.out.println("곱하기: " + mul);
		System.out.println("나누기: " + div);
		
		String changeName = arithmetic.changeName("장원영");
		System.out.println(changeName);
		
		arithmetic.prettyWonyoungChang("블랙핑크");
		
		int result3 = arithmetic.taken();
		System.out.println(result3);
		
	}

}

