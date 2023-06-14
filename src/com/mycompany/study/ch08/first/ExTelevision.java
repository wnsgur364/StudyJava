package com.mycompany.study.ch08.first;

public class ExTelevision {

	public static void main(String[] args) {
		
		// RemoteControl remoteControl = new RemoteControl();
		// 인터페이스는 객체화 시킬 수 없다.
		
		// Television television = new Television();
		// television.turnOn();
		// television.setMute(true);
		// 이 방식은 구동은 되지만 정상적으로 interface를 사용한 것이 아님
		
		RemoteControl.changeBattery();
		
		RemoteControl remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.steVolume(7);
		remoteControl.setMute(true);
		
		
	}

}
