package com.mycompany.study.ch07.second;

public class Student extends People {

	public int studentNo;
	
	public Student(String name, String sns, int studentNo) {
		super(name,sns);
		
		this.name = name;
		this.sns = sns;
		this.studentNo = studentNo;
	}
	
	public Student(String name, String sns) {
		super(name, sns);
	}
	
	public Student() {
		
	}
	
	@Override
	void sayName() {
		System.out.println("Student.name: " + name);
		
		if(studentNo >= 21) {
			super.sayName();
		}
	}
}
