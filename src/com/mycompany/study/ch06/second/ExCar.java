package com.mycompany.study.ch06.second;

public class ExCar {
    public static void main(String[] args) {

        Car car = new Car();

        Car car2 = new Car("블랙");

        Car car3 = new Car(2, "레이", "마젠타", "기아");

        System.out.println(car.engine);
        System.out.println(car.name);
        System.out.println(car.color);
        System.out.println(car.company);
        System.out.println("==========");

        System.out.println(car2.engine);
        System.out.println(car2.name);
        System.out.println(car2.color);
        System.out.println(car2.company);
        System.out.println("==========");

        System.out.println(car3.engine);
        System.out.println(car3.name);
        System.out.println(car3.color);
        System.out.println(car3.company);

    }
}
