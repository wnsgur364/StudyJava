package com.mycompany.study.ch02;

import java.util.Arrays;
import java.util.Random;

public class HelloJava {
	
	public static void main(String[] args) {

        // Create an array to store the Lotto numbers
        int[] lottoNumbers = new int[6];

        // Create a random number generator
        Random random = new Random();

        // Generate 6 random numbers between 1 and 45
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(45) + 1;
        }

        // Sort the numbers in ascending order
        Arrays.sort(lottoNumbers);

        // Print the numbers
        System.out.println("The Lotto numbers are:");
        for (int number : lottoNumbers) {
            System.out.print(number + " ");
        }
    }
}
