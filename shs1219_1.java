package shs;

import java.util.Scanner;

public class shs1219_1 {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int in,money,total=0,exit=1;
	      int cnt=0,st=0;
	      int ar[] = new int[100];
	      
	      while(exit>0) {
	         System.out.println("============================");
	         System.out.println("1.입금   2.출금   3.통계   4.종료");
	         System.out.println("============================");
	         System.out.print("입력 : ");
	         in = scan.nextInt();
	         switch(in) {
	            case 1:
	               System.out.print("입금금액 : ");
	               money = scan.nextInt();
	               total += money;
	               ar[cnt++] = money;
	               System.out.println("현재잔액 : "+total);
	               break;
	            case 2:
	               System.out.print("출금금액 : ");
	               money = scan.nextInt();
	               if(total < money) {
	                  System.out.println("잔액이 부족합니다.");
	                  break;
	               }
	               total -= money;
	               ar[cnt++] = -money;
	               System.out.println("현재잔액 : "+total);
	               break;
	            case 3:
	               for(int x=st;x<cnt;x++) {
	                  if(ar[x]>0) {
	                     System.out.print("입금 : +"+ar[x] +" ");
	                  }
	                  else {
	                     System.out.print("출금 : "+ar[x] +" ");
	                  }
	                  
	               }
	               System.out.println();
	               st = cnt;
	               break;
	            case 4:
	               System.out.println("종료");
	               exit = 0;
	               break;
	            default:
	               System.out.println("잘못입력하셨습니다");
	         }
	      }
	   }
}//ATM 기기
