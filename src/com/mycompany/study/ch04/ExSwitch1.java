package com.mycompany.study.ch04;

public class ExSwitch1 {

	public static void main(String[] args) {

		int num = 1;
		
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		default:
			System.out.println("1번도 2번도 아닌 것이 나왔습니다.");
			break;
		}
		
//		사장, 부장, 과장, 대리, 주임, 사원, 나
//		사장의 연봉은 얼마 입니다.
//		200, 100, 50, 25, 10, 5, 200조
		
		String position = "나";
		int pay = 200;
		
        switch (position) {
	        case "사장": // if(position.equals("사장")
	            System.out.println(position + "의 연봉은 " + pay +"원입니다.");
	            break;
	        case "부장":
	            System.out.println(position + "의 연봉은 " + pay + "원입니다.");
	            break;
	        case "과장":
	            System.out.println(position + "의 연봉은 " + pay + "원입니다.");
	            break;
	        case "대리":
	            System.out.println(position + "의 연봉은 " + pay + "원입니다.");
	            break;
	        case "주임":
	            System.out.println(position + "의 연봉은 " + pay + "원입니다.");
	            break;
	        case "사원":
	            System.out.println(position + "의 연봉은 " + pay + "원입니다.");
	            break;
	        case "나":
	            System.out.println(position + "의 연봉은 " + pay + "조입니다.");
	            break;   
	        default:
	            System.out.println("거지입니다.");
	            break;
        }
        
	}

}
