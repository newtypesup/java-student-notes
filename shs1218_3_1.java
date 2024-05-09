package shs;

public class shs1218_3_1 {

	public static void main(String[] args) {
		double su;
		int meter = 100;
		int i = 0;
		while(meter>0) {
			su = Math.floor(Math.random()*5)+1;
			meter -= su;
			if(meter <0) {
				meter=0;
			}
			i++;
			if(i<10) {
				System.out.println("0");
			}
			System.out.println(i+"번 ");
			System.out.println("달팽이 "+(int)su+"m전진 ");
			System.out.println("남은거리 "+meter+"m");
		}

	}

}//달팽이 게임 교수님
