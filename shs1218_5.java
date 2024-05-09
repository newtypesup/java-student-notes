package shs;

public class shs1218_5 {

	public static void main(String[] args) {
		int i, j;
		
		for(i=0;i<5;i++) {
			for(j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}//별 찍기
