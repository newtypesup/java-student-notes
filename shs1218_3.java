package shs;

public class shs1218_3 {

	public static void main(String[] args) {
		//달팽이 1-5m 총길이 100m
		int a = 100;
		int e=1;
		double d=1;
		double b, c;
		
		while((int)a>0) {
		
		b = Math.random()*5;
		System.out.println(b);
		
		c = Math.round(b);
		
		System.out.println(c);
		
		d= a-(int)c;
			
		System.out.println(d);
		
		if(d<0) {d=0;}
				
		System.out.println(e+"회 "+"전진 거리 :"+c+"m "+"남은 거리 :"+d+"m");
		
		e++;
		
		a = (int)d;
		
		if(a<0) 
			
			break;
		}
	}

}//달팽이 게임
