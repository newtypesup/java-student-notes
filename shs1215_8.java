package shs;

import java.util.Scanner;

public class shs1215_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열:\"" + inputData + "\"");
			
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
	}
}//입력받기 및 종료