package com.mycompany.study.ch04;

public class ExLotto {

    public static void main(String[] args) {
        
        // LottoNumbers 클래스에서 oldNumber 배열 불러오기
        String[] oldNumber = LottoOldNumbers.oldNumber;

        // 5번의 로또 번호 생성 반복
        for (int i=0; i<5; i++) {
            String[] lotto = new String[6]; // 로또 번호 배열 생성
            // 로또 번호 생성
            for (int j=0; j<lotto.length; j++) {
                String number;
                boolean duplicate;
                boolean consecutive;
                do {
                    duplicate = false;  // 중복 확인 변수 초기화
                    consecutive = false;    // 3연속 숫자 확인 변수 초기화
                    number = String.valueOf((int) (Math.random() * 45) + 1);    // 1에서 45 사이의 무작위 숫자 생성
                    // 이전 당첨 번호와 비교하여 중복 확인
                    for (String oldNum : oldNumber) {
                        if (oldNum.equals(number)) {
                            duplicate = true;
                            break;
                        }
                    }
                    // 이전에 생성된 번호와 비교하여 중복 확인
                    for (int k=0; k<j; k++) {
                        if (lotto[k].equals(number)) {
                            duplicate = true;
                            break;
                        }
                    }
                    // 3연속 숫자 확인 
                    if (j >= 2) {
                        int currentNum = Integer.parseInt(number);
                        int prevNum1 = Integer.parseInt(lotto[j - 1]);
                        int prevNum2 = Integer.parseInt(lotto[j - 2]);

                        if (currentNum == prevNum1 + 1 && currentNum == prevNum2 + 2) {
                            consecutive = true;
                        } else if (currentNum == prevNum1 - 1 && currentNum == prevNum2 - 2) {
                            consecutive = true;
                        }
                    }

                } while (duplicate || consecutive); // 중복이나 3연속 숫자가 있을 경우 다시 번호 생성
                lotto[j] = number;  // 생성된 번호를 로또 배열에 저장
            }
            // 로또 번호 정렬
            for (int j=0; j<lotto.length-1; j++) {
                for (int k=j+1; k<lotto.length; k++) {
                    int num1 = Integer.parseInt(lotto[j]);
                    int num2 = Integer.parseInt(lotto[k]);
                    if (num1 > num2) {
                        String temp = lotto[j];
                        lotto[j] = lotto[k];
                        lotto[k] = temp;
                    }
                }
            }
            // 로또 번호 출력
            System.out.print("로또번호: ");
            for (String number : lotto) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}