package shs;

import java.util.Scanner;

public class shs1218_4 {

	public static void main(String[] args) {
		
		String postion;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("직책을 입력하세요 : ");
		postion = scan.nextLine();
		
		switch(postion) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300마원");
			break;
		}
	}
}//스트링 타입 스위치문