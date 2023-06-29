package com.mycompany.study.test;

public class Television implements RemoteControl {
	
    int volume;

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
        }

        this.volume = volume;
        System.out.println("현재 TV 볼륨: " + volume);
    }

    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    
}
