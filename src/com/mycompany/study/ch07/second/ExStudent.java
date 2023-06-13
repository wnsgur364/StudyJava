package com.mycompany.study.ch07.second;

public class ExStudent {

	public static void main(String[] args) {

		// 명시적 생성자를 사용하여 객체를 생성하고 
		// 모들 필드를 출력하시요
		
		Student student = new Student("이준혁", "4157-1242", 2);
		
		System.out.println(student.name);
		System.out.println(student.sns);
		System.out.println(student.studentNo);
		
		
		Student student2 = new Student("김두영", "5547-8745");
		
		System.out.println(student2.name);
		System.out.println(student2.sns);
		
		student.sayName();
	}

}
