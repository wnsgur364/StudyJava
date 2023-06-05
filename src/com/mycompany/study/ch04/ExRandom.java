package com.mycompany.study.ch04;

public class ExRandom {

    public static void main(String[] args) {
        
        int min = 1;
        int max = 45;
        int random = (int) ((Math.random() * (max - min)) + min);
        System.out.println("random: " + random);

    }

}