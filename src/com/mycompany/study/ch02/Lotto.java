package com.mycompany.study.ch02;

public class Lotto {

    public static void main(String[] args) {

        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
        }

        for (int i = 0; i < lotto.length - 1; i++) {
            for (int j = i + 1; j < lotto.length; j++) {
                if (lotto[i] > lotto[j]) {
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        System.out.println("The Lotto numbers are:");
        for (int number : lotto) {
            System.out.print(number + " ");
        }
    }
}