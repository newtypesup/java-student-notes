package shs;

public class shs1218_6 {

	public static void main(String[] args) {
	      int scores[];
	      scores = new int[7]; // 크기
	      scores[3] = 100;
	      for(int i=0;i<scores.length;i++) {
	         System.out.println(scores[i]);
	      }

	      
	      String str[]= {"서울","대전","대구","부산"};
	      for(int i=0;i<str.length;i++) {
	         System.out.println(str[i]);
	      }
	  
	      
	      int[] num= {9,8,7,6,5,4,3,2,1};
	      for(int x:num) {
	         System.out.print(x +" ");//이치 배열
	      
	         
	      }
	      int[] num2 = new int[10];
	      for(int i = 0; i<9; i++) {
	    	  num2[8-i] = num[i];
	      }
	      for(int i = 0; i<9; i++) {
	    	  num[i] = num2[i];
	      }
	      System.out.println();
	      for(int x:num ) {
	    	  System.out.print(x +" ");//거꾸로 배열
	      }
	   }
}//배열
