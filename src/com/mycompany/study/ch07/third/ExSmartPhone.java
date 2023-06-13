package com.mycompany.study.ch07.third;

//import com.mycompany.study.ch07.first.CellPhone;

public class ExSmartPhone {

	public static void main(String[] args) {

		// Phone phone = new Phone(); (x)
		
		SmartPhone smartPhone = new SmartPhone("smart");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.open();
		
//		CellPhone cellPhone = new CellPhone();
	}

}
