package com.mycompany.study.ch06.first;

public class ExCar {
    public static void main(String[] args) {
        
        int a = 1;
        System.out.println("a: " + a);
        
        Car car = new Car();    // 기본생성자

        System.out.println("차종: " + car.name);
        System.out.println("색상: " + car.color);
        System.out.println("제조사: " + car.company);
        System.out.println("엔진: " + car.engine + "기통");

        car.go();
        car.back();

        Mp3 mp3 = new Mp3();

        mp3.volumeDown();

    }
}
