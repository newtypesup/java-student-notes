package shs;

import java.util.Scanner;

public class shs1215_7 {

	public static void main(String[] args) {
	      String input1,input2;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("숫자입력 : ");
	      input1 = scan.nextLine();
	      System.out.print("숫자입력 : ");
	      input2 = scan.nextLine();
	      
	      System.out.println(input1);
	      System.out.println(input2);
	      int num;
	      num = Integer.parseInt(input1)+Integer.parseInt(input2);
	      System.out.println(num);
	   }
}//스캔 + 스캔 더하기