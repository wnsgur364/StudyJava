package com.mycompany.study.ch08.third;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCollection {

	public static <E> void main(String[] args) {
		
		List<E> list = new ArrayList<E>();
		List<E> vector = new Vector<E>();
		List<E> linkedList = new LinkedList<E>();
		
		System.out.println(list);
		System.out.println(vector);
		System.out.println(linkedList);
		
	}

}
