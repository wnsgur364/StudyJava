package com.mycompany.study.test;

public class ExRemoteControl {
	
    public static void main(String[] args) {
    	
        RemoteControl remote = new Television();

        remote.turnOn();
        remote.setMute(true);
        remote.setMute(false);
        remote.setVolume(100);
        RemoteControl.changeBattery();
        remote.turnOff();

        System.out.println();

        remote.turnOn();
        remote.setMute(true);
        remote.setMute(false);
        remote.setVolume(-10);
        RemoteControl.changeBattery();
        remote.turnOff();
    }
}
