package shs;

import java.util.Scanner;

public class shs1218_7 {

	public static void main(String[] args) {
		double s;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("금액 입력 : ");
		int w= scan.nextInt();
	
		System.out.println("할인율 입력 : ");
		double dc= scan.nextDouble();
			
		s = w*(1-dc/100);
				
		System.out.println("최종가 : "+(int)s);
	}
}//할인율 계산기


//      /*  30000 - (30000 * 0.25) / 금액 - (금액 * 할인율)
//30000 * (1-0.25) / 금액 * (1 - 할인율)  */
//
//Scanner scan = new Scanner(System.in);
//System.out.print("금액 : ");
//int m = scan.nextInt();
//System.out.print("할인율 : ");
//double d = scan.nextDouble();
//double f = d/100;
//double total = m - (m*f);
//System.out.println("최종 : "+(int)total);
//}