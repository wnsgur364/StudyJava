package com.mycompany.study.ch06.TrFirst;

import java.util.Date;

public class Member {

	int memberSeq;
	String name;
	String id;
	String pw;
	String email;
	int gender;
	Date regDate;
	
	void signIn() {
		System.out.println("로그인을 합니다.");
	}
	
	void select() {
		System.out.println("회원정보를 가져옵니다.");
	}
	
	void signUp() {
		System.out.println("회원가입을 합니다.");
	}
	
	void delete() {
		System.out.println("회원탈퇴를 합니다.");
	}
	
	void update() {
		System.out.println("회원정보를 수정합니다.");
	}
	
}
