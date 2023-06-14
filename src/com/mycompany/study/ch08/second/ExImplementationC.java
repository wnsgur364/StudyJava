package com.mycompany.study.ch08.second;

public class ExImplementationC {

	public static void main(String[] args) {
		
		InterfaceA a = new ImplementationC();
		
		a.methodA();
		System.out.println("------------------------------");
		
		InterfaceB b = new ImplementationC();
		
		b.methodB();
		System.out.println("------------------------------");
		
		InterfaceC c = new ImplementationC();
		
		c.methodA();
		c.methodB();
		c.methodC();
		System.out.println("------------------------------");
		
	}

}
