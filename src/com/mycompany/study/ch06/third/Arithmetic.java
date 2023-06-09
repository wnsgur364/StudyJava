package com.mycompany.study.ch06.third;

public class Arithmetic {
	
	// 더하기 함수 (피연산자는 2개로 한정)
	// y = a + b
	public int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int sub(int a, int b) {
		int y = a - b;
		return y;
	}
	
	public int mul(int a, int b) {
		int y = a * b;
		return y;
	}
	
	public int div(int a, int b) {
		int y = a / b;
		return y;
	}
	
	public String changeName(String name) {
		String result;
		
		if(name.equals("장원영")) {
			result = "Tony";		
		} else {
			result = "I don't know";
		}
		return result;
	}
	
	public void prettyWonyoungChang(String name) {
		switch (name) {
		case "아이브": 
			System.out.println("장원영은 너무 예뻐");
			break;

		default:
			System.out.println("다른 사람은 그냥 예뻐");
			break;
		}
	}
	
	public int taken() {
		
		return 10000;
	}
	
}
