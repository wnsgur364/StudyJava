package com.mycompany.study.ch05;

public class ExArrayCreateByNew {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		
		arr1[0] = 100;
		arr1[1] = 66;
		arr1[2] = 90;
		
		String[] arr2 = new String[10];
	
		for (int i=0; i<arr1.length; i++) {
			System.out.println("index: " + i + ", value: " + arr1[i]);
		}
		
	}

}
