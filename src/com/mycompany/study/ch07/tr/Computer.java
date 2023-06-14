package com.mycompany.study.ch07.tr;

public class Computer extends Calculator {

	 @Override
    public double param(double radius) {
        return Constants.PAI_2 * radius * radius;
    }
	
}
