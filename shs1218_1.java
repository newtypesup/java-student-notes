package shs;

public class shs1218_1 {

	public static void main(String[] args) {
		double a;
		a = Math.random()*10; // (>= 0 and <1)*10

      System.out.println(a);
		
		double up, down, half;
		up = Math.ceil(a); //올림
		down = Math.floor(a); //내림 버림
		half = Math.round(a);//반올림
		
     
      System.out.println(up);
      System.out.println(down);
      System.out.println(half);
      System.out.println((int)half);//int로 정수로 변경하기
      
      double s = -7.6454;
      
      System.out.println(Math.ceil(s));//[음수] 올림
      System.out.println(Math.floor(s));//[음수] 내림 버림
      System.out.println(Math.round(s));//[음수] 반올림

	}

}//랜덤 값 추출하기. 올림, 내림, 반올림