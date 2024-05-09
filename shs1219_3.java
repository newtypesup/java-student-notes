package shs;

import java.util.Random;

public class shs1219_3 {

	public static void main(String[] args) {
	      int i,j;
	      int ar[] = new int[100];
	      int mine[][] = new int[10][10];
	      int cnt;
	      Random rand = new Random();
	      for(i=0;i<100;i++) {
	         ar[i]=rand.nextInt(100);
	         for(j=0;j<i;j++) {
	            if(ar[i] == ar[j]) {
	               i--;
	               break;
	            }
	         }
	      }
	      for(int x=0;x<20;x++) {
	         cnt = 0;
	         for(i=0;i<10;i++) {
	            for(j=0;j<10;j++) {
	               if(ar[x]==cnt) {
	                  mine[i][j] = 9;
	               }
	               cnt++;
	            }   
	         }   
	      }
	      for(i=0;i<10;i++) {
	         for(j=0;j<10;j++) {
	            if(mine[i][j]!=9) {
	               if(i-1>=0 && mine[i-1][j]==9) {
	                  mine[i][j]++;
	               }
	               if(j-1>=0 && mine[i][j-1]==9) {
	                  mine[i][j]++;
	               }
	               if(i+1<10 && mine[i+1][j]==9) {
	                  mine[i][j]++;
	               }
	               if(j+1<10 && mine[i][j+1]==9) {
	                  mine[i][j]++;
	               }
	               if(i-1>=0 && j-1>=0 && mine[i-1][j-1]==9) {
	                  mine[i][j]++;
	               }
	               if(i+1<10 && j+1<10 && mine[i+1][j+1]==9) {
	                  mine[i][j]++;
	               }
	               if(i-1>0 && j+1<10 && mine[i-1][j+1]==9) {
	                  mine[i][j]++;
	               }
	               if(i+1<10 && j-1>=0 && mine[i+1][j-1]==9) {
	                  mine[i][j]++;
	               }               
	            }
	         }   
	      }
	      for(i=0;i<10;i++) {
	         for(j=0;j<10;j++) {
	            if(mine[i][j]==9) {
	               System.out.print("X ");
	            }
	            else {
	               System.out.print(mine[i][j]+" ");
	            }
	            
	         }   
	         System.out.println();
	      }            
	   }
}//지뢰 찾기
