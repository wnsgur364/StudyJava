package com.mycompany.study.ch15.first.tr2;

import java.util.ArrayList;

public class ExMember {

	public static void main(String[] args) {

		ArrayList<Member> members = new ArrayList<Member>();
		
		Member memberTony = new Member("장원영", "Tony", "1111", "01011111111", "1@example.com"); 
		Member memberPretty = new Member("전지현", "Pretty", "2222", "01022222222", "2@example.com"); 
		Member memberGreat = new Member("장동건", "Great", "3333", "01033333333", "3@example.com"); 
		Member memberbeautiful = new Member("고소영", "beautiful", "4444", "01044444444", "4@example.com");
		
		members.add(memberTony);
		members.add(memberPretty);
		members.add(memberGreat);
		members.add(memberbeautiful);
		
//		for(Member member: members) {
//			System.out.print(member.name + " | ");
//			System.out.print(member.id + " | ");
//			System.out.print(member.pwd + " | ");
//			System.out.print(member.phone + " | ");
//			System.out.print(member.email);
//			System.out.println();
//		}
		
		for(int i=0; i<members.size(); i++) {
			System.out.print(members.get(i).name + " | ");
			System.out.print(members.get(i).id + " | ");
			System.out.print(members.get(i).pwd + " | ");
			System.out.print(members.get(i).phone + " | ");
			System.out.print(members.get(i).email);
			System.out.println();
		}

	}

}
