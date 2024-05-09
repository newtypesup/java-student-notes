package shs;

import java.util.Random;

public class shs1219_2 {

	   public static void main(String[] args) {
		      int i,j;
		      int ar[]= new int[10];
		      /*double su;      
		      for(i=0;i<10;i++) {
		         su = Math.floor(Math.random()*10)+1;
		         ar[i] = (int)su;
		         for(j=0;j<i;j++) {
		            if(ar[i] == ar[j]) {
		               i--;
		               break;
		            }
		         }
		      }*/
		      Random rand = new Random();
		      for(i=0;i<10;i++) {
		         ar[i]=rand.nextInt(10)+1;
		         for(j=0;j<i;j++) {
		            if(ar[i] == ar[j]) {
		               i--;
		               break;
		            }
		         }
		      }
		      for(i=0;i<10;i++) {
		         System.out.print(ar[i] + " ");
		      }   
		   }
}//랜덤 뽑기
