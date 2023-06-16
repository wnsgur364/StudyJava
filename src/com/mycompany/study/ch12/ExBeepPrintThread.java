package com.mycompany.study.ch12;

import java.awt.Toolkit;

public class ExBeepPrintThread {

	public static void main(String[] args) {
//		way1
//		Runnable runnable = new ExBeepRunnable();
//		Thread thread = new Thread(runnable);

//		way2
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("12");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
