package shs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class shs1218_8 {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      System.out.print("금액 : ");
	      String mstr = scan.nextLine();
	      System.out.print("할인율 : ");
	      String dstr = scan.nextLine();
	      
	      int m = Integer.parseInt(mstr.replaceAll("[^0-9]",""));
	      int d = Integer.parseInt(dstr.replaceAll("[^0-9]",""));
	      int total = (m * (100-d))/100;
	      DecimalFormat tt = new DecimalFormat("###,###");
	      String t = tt.format(total);
	      System.out.println(t+"원");
	   }
}//      repaceAll(정규표현식, 치환되는내용) 숫자만 뽑아내기
