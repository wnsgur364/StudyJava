package com.mycompany.study.ch07.first;

public class ExMobilePhone {

	public static void main(String[] args) {

		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOffDmb();
		
		MobilePhone mobilePhone = new MobilePhone();
		
		mobilePhone.dmbUse();
		
	}

}
