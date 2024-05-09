package shs;

public class shs1219_5 {

	public static void main(String[] args) {
		shs1219_3 s1/*s1으로 이름지정*/ =new shs1219_3();
		s1.main(args);/*1회*/
		System.out.println("--------------------");
		s1.main(args);/*2회*/
		System.out.println("--------------------");
		s1.main(args);/*3회*/
	}

}//클래스 호출하기 (지뢰찾기)
