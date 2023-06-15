package com.mycompany.study.ch15.first.tr;

import java.util.ArrayList;

public class ExMember {

	public static void main(String[] args) {

		ArrayList<Member> members = new ArrayList<Member>();

//		Member member = new Member("이준혁", "wnsgur364", "???", "010-4157-1242", "wnsgur364@naver.com");
//		Member member2 = new Member("이준혁1", "wnsgur3641", "???2", "010-4157-12422", "wnsgur364@naver.com2");
//		Member member3 = new Member("이준혁2", "wnsgur3642", "???3", "010-4157-12423", "wnsgur364@naver.com3");
//		Member member4 = new Member("이준혁3", "wnsgur3643", "???4", "010-4157-12424", "wnsgur364@naver.com4");
//		Member member5 = new Member("이준혁4", "wnsgur3644", "???5", "010-4157-12425", "wnsgur364@naver.com5");
//		Member member6 = new Member("이준혁5", "wnsgur3645", "???6", "010-4157-12426", "wnsgur364@naver.com6");
//		
//		arrayList.add(member);
//		arrayList.add(member2);
//		arrayList.add(member3);
//		arrayList.add(member4);
//		arrayList.add(member5);
//		arrayList.add(member6);
		
		members.add(new Member("준혁", "준혁1", "**********", "010-1111-1111", "1@example.com"));
		members.add(new Member("막장", "막장2", "**********", "010-2222-2222", "2@example.com"));
		members.add(new Member("쌈장", "쌈장3", "**********", "010-3333-3333", "3@example.com"));
		members.add(new Member("된장", "된장4", "**********", "010-4444-4444", "4@example.com"));
		members.add(new Member("간장", "간장5", "**********", "010-5555-5555", "5@example.com"));
		members.add(new Member("춘장", "춘장6", "**********", "010-6666-6666", "61@example.com"));
		
		for (Member mem: members) {
			System.out.print(mem.name + ", ");
			System.out.print(mem.id + ", ");
			System.out.print(mem.pw + ", ");
			System.out.print(mem.phone + ", ");
			System.out.print(mem.email);
			System.out.println();
		}
		
	}

}
