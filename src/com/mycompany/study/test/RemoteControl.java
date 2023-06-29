package com.mycompany.study.test;

public interface RemoteControl {

    static final int MAX_VOLUME = 10;
    static final int MIN_VOLUME = 0;

    abstract void turnOn();
    abstract void turnOff();
    abstract void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
    
}
