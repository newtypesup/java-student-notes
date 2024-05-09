package shs;

import java.util.Scanner;

public class shs1218_5_1 {

	   public static void main(String[] args) {
		      int i,j,k,cnt;
		      int u,d;
		      Scanner sc = new Scanner(System.in);
		      int z = sc.nextInt();
		      u = z / 2;
		      d = z * 2;
		      for(cnt = 0;cnt<z;cnt++) {
		         for(i=0;i<u;i++) {
		            for(j=0;j<d-i;j++) {
		               System.out.print(" ");
		            }
		            for(k=0;k<=i;k++) {
		               System.out.print("* ");
		            }
		            System.out.println();
		         }
		         u++;
		      }
		      d-=2;
		      for(cnt = 0;cnt<5;cnt++) {
		         for(j=0;j<d;j++) {
		            System.out.print(" ");
		         }
		         for(k=0;k<3;k++) {
		            System.out.print("* ");
		         }
		         System.out.println();
		      }
	   }
}