package com.mycompany.study.ch06.first;

public class ExMp3 {
    public static void main(String[] args) {
        
        Mp3 mp3 = new Mp3();    // 생성

        System.out.println("mp3의 색상은: " + mp3.color + " 입니다.");
        System.out.println("mp3의 용량은: " + mp3.size + " 테라바이트 입니다.");    // 변수 호출
        System.out.println("mp3의 사진촬영 기능은: " + mp3.isTakePhoto + " 입니다.");
        System.out.println("mp3의 이어폰은: " + mp3.isEarPhone + " 입니다.");

        mp3.car.go();
        mp3.volumeDown();   // 함수 호출
        mp3.volumeUp();

    }
}
