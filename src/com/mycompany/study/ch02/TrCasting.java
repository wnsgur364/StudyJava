package com.mycompany.study.ch02;

public class TrCasting {

	public static void main(String[] args) {
		
		double dv = 123456789;
		System.out.println("dv: " + dv);
		
		float fv = (float)dv;
		System.out.println("fv: " + fv);
		
		int iv = (int)dv;
		System.out.println("iv: " + iv);
		
		short sv = (short)iv;
		System.out.println("sv: " + sv);
		
		byte bv = (byte)sv;
		System.out.println("bv: " + bv);
		
		String stv = String.valueOf(iv);
		System.out.println("stv: " + stv);
		
		int itv = Integer.parseInt(stv);
		System.out.println("itv: " + itv);
		
	}

}
