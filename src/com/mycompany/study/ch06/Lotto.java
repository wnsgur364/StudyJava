package com.mycompany.study.ch06;

public class Lotto {
    public static void main(String[] args) {

        for (int i=0; i<5; i++) {    
            int[] lotto = new int[6];

            for (int j=0; j<lotto.length; j++) {
                int number;
                boolean duplicate;
                boolean consecutive;

                do {
                    duplicate = false;
                    consecutive = false;
                    number = ((int) (Math.random() * 45) +1);

                    for (int k=0; k<j; k++) {
                        if (lotto[k] == number) {
                            duplicate = true;
                            break;
                        } else {
                            // no operation
                        }
                    }

                    if (j >=2) {
                        int currentNum = number;
                        int prevNum1 = lotto[j - 1];
                        int prevNum2 = lotto[j - 2];

                        if (currentNum == prevNum1 + 1 && currentNum == prevNum2 + 2) {
                            consecutive = true;
                        } else if (currentNum == prevNum1 - 1 && currentNum == prevNum2 - 2) {
                            consecutive = true;
                        }
                    }
                } while (duplicate || consecutive);
                lotto[j] = number;
            } 
            
            for (int j=0; j<lotto.length-1; j++) {
                for (int k =j; k<lotto.length; k++) {
                    if (lotto[j] > lotto[k]) {
                        int temp = lotto[j];
                        lotto[j] = lotto[k];
                        lotto[k] = temp;
                    }
                }
            }

            System.out.print("로또번호: ");
            for (int number : lotto) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}