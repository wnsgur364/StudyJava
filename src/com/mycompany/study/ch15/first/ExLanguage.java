package com.mycompany.study.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {

		ArrayList<Language> arrayList = new ArrayList<Language>();
		
		for(Language language: arrayList) {
			System.out.println("Language name: " + language.name);
			System.out.println("Language version: " + language.version);
		}
		
//		arrayList.add("JAVA", 11); // Language 객체를 넣어야 해서 오류가 발생
		
		Language language = new Language("JAVA", 11);
		
		arrayList.add(language);
		
		for(Language lang: arrayList) {
			System.out.println("Language name: " + lang.name);
			System.out.println("Language version: " + lang.version);
			System.out.println("====================");
		}
		
//		List<String> list = new ArrayList<String>();
//		
//		list.add("JAVA");
//		list.add("Python");
//		list.add("Node");
//		list.add(2, "C#");
//		
//		int i = 0;
//		for(String a: list) {
////		String a = list[i];
//			System.out.println(i + ": " + a);
//			i++;
//		}
//
//		System.out.println("-------------------");	
//		
//		list.remove(2);
//		list.remove("Python");
//		
//		
//		int j = 0;
//		for(String a: list) {
////		String a = list[j];
//			System.out.println(j + ": " + a);
//			j++;
//		}
		
//		System.out.println("-------------------");		
		
//		for (int i=0; i<list.size(); i++) {
//		System.out.println("list.get(" + i + "): " +list.get(i));
//		}		

//		System.out.println("-------------------");			
		
//		ArrayList<String> arrayList = new ArrayList<String>();
//		
//		arrayList.add("JOVA");
//		arrayList.add("Pythen");
//		arrayList.add("Noda");
//		arrayList.add(2, "D#");
//		
//		for (int i=0; i<arrayList.size(); i++) {
//			System.out.println("arrayList.get(" + i + "): " +arrayList.get(i));
//		}
//		
//		System.out.println("-------------------");
//		
//		for(String a: arrayList) {
//			System.out.println("a: " + a);
//		}
		
	}
	
}
