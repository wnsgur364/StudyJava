package com.mycompany.study.ch06.seventh;

public class ExPersion {

	public static void main(String[] args) {

		Persion persion = new Persion(null, "1234", "이준혁");
		
//		persion.nation = "미국";	// final 은 중간에 값 대입 불가능
//		persion.ssn = "묻지마";	// final 은 중간에 값 대입 불가능
		persion.name = "Michael";
		
	}

}
