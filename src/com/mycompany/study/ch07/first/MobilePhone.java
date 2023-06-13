package com.mycompany.study.ch07.first;

public class MobilePhone extends DmbCellPhone {
	
	void dmbUse() {
		powerOn();
		turnOnDmb();
		changeChannelDmb(1);
	}
	
	@Override
	void changeChannelDmb(int channel) {
		System.out.println("MobilePhone.changeChannelDmb");
	}
	
}
